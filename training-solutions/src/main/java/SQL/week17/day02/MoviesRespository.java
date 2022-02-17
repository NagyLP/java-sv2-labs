package SQL.week17.day02;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MoviesRespository {

    private final DataSource dataSource;

    public MoviesRespository(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public void saveMovie(String title, LocalDate relasedate) {
        try (Connection connection =
                     dataSource.getConnection();
             PreparedStatement stmt =
                     connection.prepareStatement("insert into movies(title, release_date) values(?,?)")) {
            stmt.setString(1, title);
            stmt.setDate(2, Date.valueOf(relasedate));
            stmt.executeUpdate();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Connection ERROR...", sqle);
        }
    }

    // ELEGENDŐ a Statement, nem kell PrepareState..., mert nem paraméterezett)
// Statement.setFetchSize(int rows) -> Adatmennyiség
    public List<Movie> listAllMoviesInAscend() {
        try (ResultSet resultSet = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM movies ORDER BY")) {
            return processResultSet(resultSet);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Connection ERROR...", sqle);
        }
    }

    private List<Movie> processResultSet(ResultSet rs) {
        List<Movie> movies = new ArrayList<>();
        try {
            while (rs.next()) {
                long id = rs.getLong("id");
                String title = rs.getString("title");
                LocalDate relaseDate = rs.getDate("release_date").toLocalDate();
                movies.add(new Movie(id, title, relaseDate));
            }
            throw new IllegalStateException("No result");
        } finally {
            return movies;
        }
    }
}
