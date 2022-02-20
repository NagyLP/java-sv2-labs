package SQL.week17.day02;

import SQL.services.SqlQuery;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MoviesRepository {

    private final DataSource dataSource;

    public MoviesRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public long idFromTitle(String title) {
        try (SqlQuery query = new SqlQuery(dataSource.getConnection())) {
            query.setPreparedStatement(query.connection()
                    .prepareStatement("SELECT id" +
                            "FROM movies" +
                            "WHERE title = ?;"));
            query.preparedStatement().setString(1, title);
            query.setResult(query.preparedStatement().executeQuery());

            if (query.result().next()) {
                return query.result().getLong("id");
            }
            throw new IllegalArgumentException("Invalid title - EXCEPTION");

        } catch (SQLException sqle) {
            throw new IllegalStateException("Connection ERROR", sqle);
        }
    }

    public long saveMovie(String title, LocalDate relasedate) {
        try (Connection connection =
                     dataSource.getConnection();
             PreparedStatement stmt =
                     connection.prepareStatement("insert into movies(title, release_date) values(?,?)",
                             Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, title);
            stmt.setDate(2, Date.valueOf(relasedate));
            stmt.executeUpdate();
            return executeAndGetGeneratedKey(stmt);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Connection ERROR...", sqle);
        }
    }

// ELEGENDŐ a Statement, nem kell PrepareState..., mert nem paraméterezett)

    public List<Movie> findAllMovies() {
        try (ResultSet resultSet = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM movies")) {
            return processResultSet(resultSet);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Connection ERROR...", sqle);
        }
    }

    private List<Movie> processResultSet(ResultSet rs) throws SQLException {
        List<Movie> movies = new ArrayList<>();
        while (rs.next()) {
            long id = rs.getLong("id");
            String title = rs.getString("title");
            LocalDate relaseDate = rs.getDate("release_date").toLocalDate();
            movies.add(new Movie(id, title, relaseDate));
        }
        return movies;
    }

    private long executeAndGetGeneratedKey(PreparedStatement stmt) {
        try (
                ResultSet rs = stmt.getGeneratedKeys()
        ) {
            if (rs.next()) {
                return rs.getLong(1);
            } else {
                throw new SQLException("No key has generated");
            }
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Update ERROR", sqle);
        }
    }
}
