package activitytracker_jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class ActivityDao {

    private final JdbcTemplate jdbcTemp;
    private final TrackPointDao trackPointDao;

    public ActivityDao(DataSource dataSource) {
        this.jdbcTemp = new JdbcTemplate(dataSource);
        this.trackPointDao = new TrackPointDao(dataSource);
    }

    public void saveActivities(List<Activity> activities) {
        for (Activity activity : activities) {
            jdbcTemp.update(
                    "INSERT INTO" +
                            " activities(start_time,activity_desc,activity_type)" +
                            " VALUES(?,?,?);",
                    Timestamp.valueOf(activity.getStartTime()),
                    activity.getDescription(),
                    activity.getType().name()
            );
        }
    }

    public Activity saveActivityAndKeyBack(Activity activity) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemp.update(con -> createPreparedStatement(con, activity), keyHolder);
        Number key = keyHolder.getKey();
        if (key == null) {
            throw new IllegalStateException("No generated Key...");
        }
        return getActivityById(key.longValue());
    }


    public List<Activity> listActivities() {
        return jdbcTemp.query(
                "SELECT * FROM" +
                        " activities;",
                this::createActivity);
    }

    public Activity getActivityById(long id) {
        return jdbcTemp.queryForObject(
                "SELECT * FROM activities" +
                        " WHERE id = ?;",
                this::createActivity, id);
    }

    @SuppressWarnings("java:S2095")
    private PreparedStatement createPreparedStatement(Connection conn, Activity activity) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(
                "INSERT INTO" +
                        " activities(start_time,activity_desc,activity_type)" +
                        " VALUES(?,?,?);",
                Statement.RETURN_GENERATED_KEYS
        );
        stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
        stmt.setString(2, activity.getDescription());
        stmt.setString(3, activity.getType().name());
        return stmt;
    }

    private Activity createActivity(ResultSet rs, long rowNum) throws SQLException {
        return new Activity(
                rs.getLong("id"),
                rs.getTimestamp("start_time").toLocalDateTime(),
                rs.getString("activity_desc"),
                ActivityType.valueOf(rs.getString("activity_type")),
                trackPointDao.listTrackPointsByActivityId(rs.getLong("id"))
        );
    }

}
