package SQL.week17.day01;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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

        try (Connection connection = dataSource.getConnection(); Statement stmt = connection.createStatement()) {
            stmt.executeUpdate("insert into actors(actor_name) values('John Doe')");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot connect!", sqle);
        }

        ActorsRepository actorsRepository = new ActorsRepository(dataSource);
        actorsRepository.saveActor("Jack Doe");

        System.out.println(actorsRepository.findActorsWithPrefix("Jac"));
    }
}
