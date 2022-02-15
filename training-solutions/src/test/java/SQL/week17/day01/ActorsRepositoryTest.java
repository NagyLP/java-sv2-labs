package SQL.week17.day01;

class ActorsRepositoryTest {

    /*  INTEGRÁCIÓS TESZT analógiának JéUnit 5 */
// EmployeeDao osztály a példányosításkor az adatbázis eléréséhez szükséges adatokat kívülről,
// egy DataSource-ként, dependency injection formájában kapja meg a konstruktorban.

/*    EmployeeDao employeeDao;

    @BeforeEach
    void init() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/employees?useUnicode=true");

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        // Db kiürítése és az adattartalom újra létrehozása
        flyway.clean();
        flyway.migrate();

        employeeDao = new EmployeeDao(dataSource);
    }

    @Test
    void testInsertThanQuery() {
        employeeDao.saveEmployee("John Doe");

        List<String> names = employeeDao.listEmployeeNames();
        assertEquals(Arrays.asList("John Doe"), names);
    }*/

}

}