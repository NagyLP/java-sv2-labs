package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityTrackerMain {

    public static void main(String[] args) {
        ActivityTrackerMain main = new ActivityTrackerMain();

        ActivityDao activityDao = new ActivityDao(main.connectToCleanMariaDB());

        Activity activityOne = new Activity(LocalDateTime.of(2022, 2, 30, 25, 69),
                "Futás",
                ActivityType.RUNNING);
        Activity activityTwo = new Activity(LocalDateTime.of(2022, 2, 31, 26, 69),
                "Túrázás",
                ActivityType.HIKING);
        Activity activityThere = new Activity(LocalDateTime.of(2022, 2, 32, 30, 59),
                "Kerékpározás",
                ActivityType.BIKING);
//        MariaDbDataSource dataSource = new MariaDbDataSource();
        activityDao.saveActivity(activityOne);
        activityDao.saveActivity(activityTwo);
        activityDao.saveActivity(activityThere);

        List<Activity> activities = new ArrayList<>();
        activities.add(activityOne);
        activities.add(activityTwo);
        activities.add(activityThere);

        activityDao.saveActivities(activities);


    }


    private MariaDbDataSource connectToCleanMariaDB() {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/movies-actors?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
            Flyway flyway = Flyway.configure().dataSource(dataSource).load();
            flyway.clean();
            flyway.migrate();
            return dataSource;

        } catch (SQLException sqle) {
            throw new IllegalStateException("Connection ERROR");
        }
    }
}
