package SQL.week17.day02;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoviesRespositoryTest {

    MoviesRespository moviesRespository;
    MariaDbDataSource dataSource = new MariaDbDataSource();

    @BeforeEach
    void init() throws SQLException {
        dataSource.setUrl("jdbc:mariadb://localhost:3306/movies-actors?useUnicode=true");
        dataSource.setUser("***");
        dataSource.setPassword("***");
        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        // Db kiürítése és az adattartalom újra létrehozása
        flyway.clean();
        flyway.migrate();

    }

    @Test
    void testInsertThanQuery() throws SQLException {
        MoviesRespository moviesRespository = new MoviesRespository(dataSource);
        moviesRespository.saveMovie("Tanu", LocalDate.parse("1969-01-01"));
//        ResultSet resultSet = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM movies");
//        Movie movie = new Movie(1, "Tanu", LocalDate.of(1969,01,01));
        assertEquals("[Movie: \n id: 1 \n title: 'Tanu' \n release_date: 1969-01-01]", moviesRespository.findAllMovies().toString());
    }

}