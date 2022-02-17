package SQL.week17.day02;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoviesRespositoryTest {

    private MoviesRespository moviesRespository;
    private Flyway flyway;

    @BeforeEach
    void init() throws SQLException {
        MariaDbDataSource dataSource = new MariaDbDataSource();

        dataSource.setUrl("jdbc:mariadb://localhost:3306/movies-actors?useUnicode=true");
        dataSource.setUser("***");
        dataSource.setPassword("***");
        flyway = Flyway.configure().dataSource(dataSource).load();

        // Db kiürítése és az adattartalom újra létrehozása
        flyway.clean();
        flyway.migrate();

        moviesRespository = new MoviesRespository(dataSource);
        moviesRespository.saveMovie("Tanu", LocalDate.parse("1969-01-01"));
    }

    @Test
    void testInsertThanQuery() throws SQLException {
        assertEquals("[Movie: \n  id: 1\n  title: 'Tanu'\n  release_date: 1969-01-01]", moviesRespository.findAllMovies().toString());
    }

    @AfterEach
    void cleanTestDBase() {
        flyway.clean();
    }
}