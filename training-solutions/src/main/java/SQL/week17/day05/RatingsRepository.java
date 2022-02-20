package SQL.week17.day05;

import Week17.services.SqlQuery;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RatingsRepository {

    private final DataSource dataSource;

    public RatingsRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertRatings(long movieId, List<Integer> ratings) {
        try (SqlQuery query = new SqlQuery(dataSource.getConnection())) {
            query.connection().setAutoCommit(false);
            query.setPreparedStatement(query.connection()
                    .prepareStatement("INSERT INTO ratings(movie_id, rating) values(?, ?)"));
            query.preparedStatement().setLong(1, movieId);
            for (int item : ratings) {
                if (item < 1 || item > 5) {
                    query.connection().rollback();
                    throw new IllegalArgumentException("Invalid rating: " + item);
                }
                query.preparedStatement().setInt(2, item);
                query.preparedStatement().executeUpdate();
            }
            query.connection().commit();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert rating", sqle);
        }
    }

    public List<Integer> fetchRatingsByMovieId(long movieId) {
        try (SqlQuery query = new SqlQuery(dataSource.getConnection())) {
            query.setPreparedStatement(query.connection()
                    .prepareStatement("SELECT rating from ratings WHERE movie_id = ?"));
            query.preparedStatement().setLong(1, movieId);
            List<Integer> ratings = new ArrayList<>();
            while (query.result().next()) {
                ratings.add(query.result().getInt("rating"));
            }
            return ratings;

        } catch (SQLException sqle) {
            throw new IllegalStateException("Not found rating", sqle);
        }
    }
}