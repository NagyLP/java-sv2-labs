package activitytracker_jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class TrackPointDao {

    private final JdbcTemplate jdbcTemp;

    public TrackPointDao(DataSource dataSource) {
        jdbcTemp = new JdbcTemplate(dataSource);
    }


}
