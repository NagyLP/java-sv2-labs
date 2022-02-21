package SQL.week17.day05;

import SQL.week17.day02.MoviesRepository;
import SQL.week17.day04.Actor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MovieRatingsService {

    private final MoviesRepository moviesRepository;
    private final RatingsRepository ratingsRepository;

    public MovieRatingsService(MoviesRepository moviesRepository,
                               RatingsRepository ratingsRepository) {
        this.moviesRepository = moviesRepository;
        this.ratingsRepository = ratingsRepository;
    }

    public void addRatingsByTitle(String title, Integer... ratings) {
        ratingsRepository.insertRatings(
                moviesRepository.idFromTitle(title), Arrays.asList(ratings));

//        try (SqlQuery query = new SqlQuery(dataSource.getConnection())) {
//            query.setPreparedStatement(query.connection()
//                    .prepareStatement("INSERT INTO ratings (movie_id, rating) VALUES (?,?);"));
//            query.preparedStatement().setLong(1, moviesRepository.idFromTitle(title));
//
//            for (Integer rating : ratings) {
//                query.preparedStatement().setInt(2, rating);
//                query.preparedStatement().executeUpdate();
//            }
//
//        } catch (SQLException sqle) {
//            throw new IllegalStateException("Insert FAILED", sqle);
//        }
    }

    public double getAverageRatingById(long movieId) {
        return ratingsRepository.fetchAverageRatingById(movieId);
    }

    private Optional<Actor> processSelectStatement(PreparedStatement statement) throws SQLException {
        try (ResultSet rs = statement.executeQuery()) {
            if (rs.next()) {
                return Optional.of(new Actor(rs.getLong("id"), rs.getString("actor_name")));
            }
            return Optional.empty();
        }
    }

    public List<Integer> getRatingsById(long movieId) {
        return ratingsRepository.fetchRatingsByMovieId(movieId);
    }

    public List<Integer> getRatingsByTitle(String title) {
        return ratingsRepository.fetchRatingsByMovieId(moviesRepository.idFromTitle(title));
    }
}
