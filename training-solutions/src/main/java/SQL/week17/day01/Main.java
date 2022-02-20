package SQL.week17.day01;

import Week17.day02.MoviesRepository;
import Week17.day04.ActorsMoviesRepository;
import Week17.day04.ActorsMoviesService;
import Week17.day05.MovieRatingsService;
import Week17.day05.RatingsRepository;
import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MariaDbDataSource dataSource = new MariaDbDataSource();

        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/movies-actors?useUnicode=true");
            dataSource.setUser("***");
            dataSource.setPassword("***");
        } catch (SQLException throwables) {
            throw new IllegalStateException("Cannot reach DataBase!");
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

/*
        try (Connection connection = dataSource.getConnection(); Statement stmt = connection.createStatement()) {
            stmt.executeUpdate("insert into actors(actor_name) values('John Doe')");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot connect!", sqle);
        }

        ActorsRepository actorsRepository = new ActorsRepository(dataSource);
        actorsRepository.saveActor("Olvasztó Imre");
        System.out.println(actorsRepository.findActorsWithPrefix("Olvaszt"));

        MoviesRespository moviesRespository = new MoviesRespository(dataSource);
        moviesRespository.saveMovie("Indul a bakterház", LocalDate.parse("1979-01-01"));
        System.out.println(moviesRespository.findAllMovies());
*/

        ActorsRepository actorsRepository = new ActorsRepository(dataSource);
        MoviesRepository moviesRepository = new MoviesRepository(dataSource);
        ActorsMoviesRepository actorsMoviesRepository = new ActorsMoviesRepository(dataSource);
        ActorsMoviesService service = new ActorsMoviesService(actorsRepository, moviesRepository, actorsMoviesRepository);
        RatingsRepository ratingsRepository = new RatingsRepository(dataSource);

//        service.insertMovieWithActors("Indul a bakterház", LocalDate.parse("1969-12-31"), List.of("Olvasztó Imre", "Koltai Róbert"));

        ActorsMoviesService actorsMoviesService = new ActorsMoviesService(actorsRepository, moviesRepository, actorsMoviesRepository);
        actorsMoviesService.insertMovieWithActors("Titanic", LocalDate.parse("1997-12-11"), List.of("Leonardo DiCaprio", "Kate Winslet"));
        actorsMoviesService.insertMovieWithActors("Great Gatsby", LocalDate.parse("2012-07-23"), List.of("Tobey Maguire", "Leonardo DiCaprio"));

        MovieRatingsService movieRatingsService = new MovieRatingsService(moviesRepository, ratingsRepository);
        movieRatingsService.addRatingsByTitle("Titanic", 5, 2);
        try {
            movieRatingsService.addRatingsByTitle("Great Gatsby", 1, 4, 6);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        movieRatingsService.addRatingsByTitle("Great Gatsby", 1, 4);
        System.out.println(movieRatingsService.getRatingsByTitle("Titanic"));
        System.out.println(movieRatingsService.getRatingsByTitle("Great Gatsby"));

        System.out.println(moviesRepository.findAllMovies());
        System.out.println(actorsRepository.findActorByName("Leonardo DiCaprio"));
        System.out.println(actorsRepository.findActorByName("Leonardo Di"));
        System.out.println(actorsRepository.findActorsWithPrefix("A"));
    }
}

