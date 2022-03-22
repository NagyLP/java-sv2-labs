package kepesitovizsga.jurassic;

import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JurassicPark {

    MariaDbDataSource dataSource;
    JdbcTemplate jdbcTemp;

    public JurassicPark(DataSource dataSource) {
        jdbcTemp = new JdbcTemplate(dataSource);
    }


    public List<String> checkOverpopulation() {
        return jdbcTemp.query(
                "SELECT breed" +
                        " FROM dinosaur" +
                        " WHERE actual > expected" +
// DEF. ORDER ASC...
                        " ORDER BY breed ASC;",
                this::mapRow);
    }

    private String mapRow(ResultSet rs, int rowNum) throws SQLException {
        return rs.getString("breed");
    }
}
