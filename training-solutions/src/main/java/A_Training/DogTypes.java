package A_Training;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class DogTypes {

    //    private DataSource dataSource;
    private final JdbcTemplate jdbcTemp;

    public DogTypes(DataSource dataSource) {
//        this.dataSource = dataSource;
        this.jdbcTemp = new JdbcTemplate(dataSource);
    }

    public List<String> getDogsByCountry(String country) {
        return jdbcTemp.query(
                "SELECT LOWER(name) AS name FROM dog_types WHERE country = ?;",
                (resultSet, row) -> resultSet.getString("name"), country);
    }


//    public List<String> getDogsByCountry(String country) {
//        try (Connection conn = dataSource.getConnection();
//             PreparedStatement stmt = conn.prepareStatement(
//                     "SELECT" +
//                             " LOWER(name) AS 'name'" +
//                             " FROM dog_types" +
//                             " WHERE country = ?;")
//             ;) {
//            stmt.setString(1, "country");
//
//            return fetchNamesList(stmt);
//        } catch (SQLException slqe) {
//            throw new IllegalStateException("ERROR - Can not reach the database", slqe);
//        }
//
//    }
//
//    private List<String> fetchNamesList(PreparedStatement stmt) {
//        List<String> namesList = new ArrayList<>();
//        try (ResultSet rs = stmt.executeQuery();) {
//            while (rs.next()) {
//                String name = rs.getString("name");
//                namesList.add(name);
//            }
//        } catch (SQLException sqle) {
//            throw new IllegalArgumentException("Invalid name", sqle);
//        }
//        return namesList;
//    }
}
