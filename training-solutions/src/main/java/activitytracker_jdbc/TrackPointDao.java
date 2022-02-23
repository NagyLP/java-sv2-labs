package activitytracker_jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TrackPointDao {

    private final JdbcTemplate jdbcTemp;

    public TrackPointDao(DataSource dataSource) {
        jdbcTemp = new JdbcTemplate(dataSource);
    }

    public void insertTrackPoints(List<TrackPoint> trackPoints, long activityId) {
        for (TrackPoint tp : trackPoints) {
            jdbcTemp.update("INSERT INTO" +
                            " track_points(time,lat,lon,activity_id)" +
                            " VALUES(?,?,?,?);",
                    tp.getTime(), tp.getLat(), tp.getLon(), activityId);
        }
    }

    public List<TrackPoint> listTrackPointsByActivityId(long id) {
        return jdbcTemp.query("SELECT * FROM" +
                " track_points" +
                " WHERE activity_id = ?;", this::createTrackPoint, id);
    }

    private TrackPoint createTrackPoint(ResultSet rs, int rowNum) throws SQLException {
        return new TrackPoint(
                rs.getLong("id"),
                rs.getDate("time").toLocalDate(),
                rs.getDouble("lat"),
                rs.getDouble("lon")
        );
    }

}
