package activitytracker_jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class ActivityDao {

    private final JdbcTemplate jdbcTemp;
    private final TrackPointDao trackPointDao;

    public ActivityDao(DataSource dataSource) {
        this.jdbcTemp = new JdbcTemplate(dataSource);
        this.trackPointDao = new TrackPointDao(dataSource);
    }


}
