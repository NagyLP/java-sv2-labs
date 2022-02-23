package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TrackPointDao {

    MariaDbDataSource dataSource;

    public TrackPointDao(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertTrackPoints(List<TrackPoint> trackpoints, long activityId) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement(
                        "INSERT INTO" +
                                " track_points(time,lat,lon,activity_id)" +
                                " VALUES(?,?,?,?)")
        ) {
            conn.setAutoCommit(false);
            for (TrackPoint trackPoint : trackpoints) {
                if (!trackPoint.coordinatesValid()) {
                    conn.rollback();
                    throw new IllegalArgumentException("Invalid coordinates - Rollback...");
                }
                stmt.setDate(1, Date.valueOf(trackPoint.getTime()));
                stmt.setDouble(2, trackPoint.getLat());
                stmt.setDouble(3, trackPoint.getLon());
                stmt.setDouble(4, activityId);
                stmt.executeUpdate();
            }
            conn.commit();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Insert failed...");
        }
    }
}

