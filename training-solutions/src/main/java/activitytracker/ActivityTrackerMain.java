package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;

public class ActivityTrackerMain {

    public static void main(String[] args) {
        ActivityTrackerMain main = new ActivityTrackerMain();
        try {
            main.connectToCleanMariaDb();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Connection ERROR");
        }
    }

    private void connectToCleanMariaDb() throws SQLException {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/movies-actors?useUnicode=true");
        dataSource.setUser("activitytracker");
        dataSource.setPassword("activitytracker");

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();
    }
}
