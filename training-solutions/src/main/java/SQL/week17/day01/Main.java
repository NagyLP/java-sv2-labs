package SQL.week17.day01;

import Week17.day02.MoviesRespository;
import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        MariaDbDataSource dataSource = new MariaDbDataSource();

        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/movies-actors?useUnicode=true");
            dataSource.setUser("***");
            dataSource.setPassword("***");
        } catch (SQLException throwables) {
            throw new IllegalStateException("Cannot reach DataBase!");
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        try (Connection connection = dataSource.getConnection(); Statement stmt = connection.createStatement()) {
            stmt.executeUpdate("insert into actors(actor_name) values('John Doe')");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot connect!", sqle);
        }

        ActorsRepository actorsRepository = new ActorsRepository(dataSource);
        actorsRepository.saveActor("Olvasztó Imre");
        System.out.println(actorsRepository.findActorsWithPrefix("Olvaszt"));

        MoviesRespository moviesRespository = new MoviesRespository(dataSource);
        moviesRespository.saveMovie("Indul a bakterház", LocalDate.parse("1979-01-01"));
        System.out.println(moviesRespository.findAllMovies());
    }
}
