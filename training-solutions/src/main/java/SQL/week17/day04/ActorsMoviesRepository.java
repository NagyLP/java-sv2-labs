package SQL.week17.day04;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ActorsMoviesRepository {

    private final DataSource dataSource;

    public ActorsMoviesRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public void insertActorAndMovieId(long actorId, long movieId) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt =
                     conn.prepareStatement("INSERT INTO actors_movies(actorId, movieId)" +
                             "values(?,?)")) {
            stmt.setLong(1, actorId);
            stmt.setLong(2, movieId);
            stmt.execute();

        } catch (SQLException sqle) {
            throw new IllegalStateException("Insert ERROR");
        }
    }
}
