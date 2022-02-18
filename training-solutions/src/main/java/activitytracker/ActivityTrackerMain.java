package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;

public class ActivityTrackerMain {

    public static void main(String[] args) {
        ActivityTrackerMain main = new ActivityTrackerMain();
        main.connectMariaDataSource();


    }

    private void connectMariaDataSource() {
        MariaDbDataSource dataSource = new MariaDbDataSource();

        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/movies-actors?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (
                SQLException throwables) {
            throw new IllegalStateException("Connection ERROR");
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();
    }
}
