package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;

public class ActivityTrackerMain {

    public static void main(String[] args) {
        ActivityTrackerMain main = new ActivityTrackerMain();

        Flyway flyway = Flyway.configure().dataSource(main.connectToCleanMariaDB()).load();
        flyway.clean();
        flyway.migrate();


    }

    private DataSource connectToCleanMariaDB() {
        try {
            MariaDbDataSource dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/movies-actors?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
            return dataSource;

        } catch (SQLException sqle) {
            throw new IllegalStateException("Connection ERROR");
        }
    }
}
