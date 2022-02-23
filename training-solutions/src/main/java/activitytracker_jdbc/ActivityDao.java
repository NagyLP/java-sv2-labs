package activitytracker_jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ActivityDao {

    private final JdbcTemplate jdbcTemp;
    private final TrackPointDao trackPointDao;

    public ActivityDao(DataSource dataSource) {
        this.jdbcTemp = new JdbcTemplate(dataSource);
        this.trackPointDao = new TrackPointDao(dataSource);
    }

    public Activity saveActivityAndKeyBack(Activity activity) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemp.update(
                ""
        )
    }

    public List<Activity> listActivities(long id) {
        return jdbcTemp.queryForObject(
                "SELECT * FROM" +
                        " activities" +
                        " WHERE id = ?;",
                this::createActivity, id);
    }

    private List<Activity> createActivity(ResultSet rs, long rowNum) throws SQLException {
        return new Activity(
                rs.getLong("id"),
                rs.getTimestamp("start_time").toLocalDateTime(),
                rs.getString("activity_desc"),
                ActivityType.valueOf(rs.getString("activity_type")),
                trackPointDao.listTrackPointsByActivityId(rs.getLong("id"))
        );
    }
}
