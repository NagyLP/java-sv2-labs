package activitytracker_jdbc;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class ActivityDaoTest {

    ActivityDao dao;
//    DatabaseMetadataDao dataDao;

    @BeforeEach
    void setUp() throws SQLException {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
        dataSource.setUser("activitytracker");
        dataSource.setPassword("activitytracker");

        Flyway fw = Flyway.configure().dataSource(dataSource).load();
        fw.clean();
        fw.migrate();

        dao = new ActivityDao(dataSource);
//        dataDao = new DatabaseMetadataDao(dataSource);

        Activity activity1 = new Activity(LocalDateTime.of(2021, 2, 22, 15, 35), "futás a parkban", ActivityType.RUNNING);
        dao.saveActivityAndKeyBack(activity1);
        Activity activity2 = new Activity(LocalDateTime.of(2020, 8, 10, 11, 12), "Egész héten Zemplén!!!", ActivityType.HIKING);
        dao.saveActivityAndKeyBack(activity2);

        List<Activity> activities = new ArrayList<>();
        Activity activity3 = new Activity(LocalDateTime.of(2020, 10, 2, 8, 15), "egész napos bicótúra", ActivityType.BIKING);
        activities.add(activity3);
        Activity activity4 = new Activity(LocalDateTime.of(2021, 1, 22, 9, 46), "meccs az iskola tornatermében", ActivityType.BASKETBALL);
        activities.add(activity4);
        Activity activity5 = new Activity(LocalDateTime.of(2020, 12, 22, 7, 52), "kis kör a tó körül", ActivityType.RUNNING);
        activities.add(activity5);
        dao.saveActivities(activities);
    }

    @Test
    void testFindActivityById() {
        Activity activity = dao.getActivityById(4);

        Assertions.assertEquals(LocalDateTime.of(2021, 1, 22, 9, 46), activity.getStartTime());
        Assertions.assertEquals("meccs az iskola tornatermében", activity.getDescription());
        Assertions.assertEquals(ActivityType.BASKETBALL, activity.getType());
    }

    @Test
    void testListActivities() {
        List<Activity> activities = dao.listActivities();

        Assertions.assertEquals(5, activities.size());
        Assertions.assertEquals(LocalDateTime.of(2020, 8, 10, 11, 12), activities.get(1).getStartTime());
        Assertions.assertEquals("egész napos bicótúra", activities.get(2).getDescription());
        Assertions.assertEquals(ActivityType.RUNNING, activities.get(4).getType());
    }

    @Test
    void testSaveActivityAndReturnGeneratedKeys() {
        Activity activity = new Activity(LocalDateTime.of(2021, 2, 23, 9, 56), "séta a kertben a napon", ActivityType.RUNNING);
        Activity expected = dao.saveActivityAndKeyBack(activity);

        Assertions.assertEquals(6, expected.getId());
    }

}