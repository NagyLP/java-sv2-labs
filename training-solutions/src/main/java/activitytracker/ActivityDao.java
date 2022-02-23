package activitytracker;

import SQL.services.SqlQuery;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private final MariaDbDataSource dataSource;

    public ActivityDao(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }


    public void saveActivity(Activity activity) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement(
                     "INSERT INTO activities" +
                             "(start_time, description, activity_type)" +
                             "VALUES (?, ?, ?);")) {
            setPreparedStatement(activity, stmt);
            stmt.executeUpdate();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Insert value ERROR", sqle);
        }
    }

    public void saveActivities(List<Activity> activities) {
        activities.forEach(this::saveActivity);
    }

    public Activity findActivityById(long id) {
        try (SqlQuery query = new SqlQuery(dataSource.getConnection())) {
            query.setPreparedStatement(query.connection()
                    .prepareStatement("SELECT * FROM activities WHERE id = ?"));
            query.preparedStatement().setLong(1, id);
            query.setResult(query.preparedStatement().executeQuery());
            if (query.result().next()) {
                return createActivityFromResultSet(query.result());
            }
            throw new IllegalArgumentException("No record by ID: " + id);
        } catch (SQLException sqle) {
            throw new IllegalStateException("UNABLE to fetch", sqle);
        }
    }

    public List<Activity> listActivities() {
        try (SqlQuery query = new SqlQuery(dataSource.getConnection())) {
            query.setPreparedStatement(query.connection().prepareStatement(
                    "SELECT * FROM activities;"));
            query.setResult(query.preparedStatement().executeQuery());
            List<Activity> activities = new ArrayList<>();
            while (query.result().next()) {
                activities.add(createActivityFromResultSet(query.result()));
            }
            return activities;
        } catch (SQLException sqle) {
            throw new IllegalStateException("UNABLE to fetch", sqle);
        }
    }

    public Activity saveActivityAndReturnGeneratedKeys(Activity activity) {
        try (SqlQuery query = new SqlQuery(dataSource.getConnection())) {
            query.setPreparedStatement(query.connection().prepareStatement(
                    "INSERT INTO activities" +
                            "(start_time, description, activity_type)" +
                            "VALUES (?,?,?);", Statement.RETURN_GENERATED_KEYS));

            setPreparedStatement(activity, query.preparedStatement());
            query.preparedStatement().executeLargeUpdate();
            query.setResult(query.preparedStatement().getGeneratedKeys());

            if (query.result().next()) {
                long id = query.result().getLong(1);
                TrackPointDao trackPointDao = new TrackPointDao(dataSource);
                trackPointDao.insertTrackPoints(activity.getTrackpoints(), id);
                return findActivityById(id);
            }
            throw new IllegalArgumentException("NO KEY" + activity);

        } catch (SQLException sqle) {
            throw new IllegalStateException("UNABLE to insert", sqle);
        }
    }

    private Activity createActivityFromResultSet(ResultSet rs) throws SQLException {
        return new Activity(
                rs.getLong("id"),
                rs.getTimestamp("start_time").toLocalDateTime(),
                rs.getString("description"),
                ActivityType.valueOf(rs.getString("activity_type")));
    }

    private void setPreparedStatement(Activity activity, PreparedStatement stmt) throws SQLException {
        stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
        stmt.setString(2, activity.getDescription());
        stmt.setString(3, activity.getType().toString());
    }
}

