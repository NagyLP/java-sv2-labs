package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {

    private final List<Movie> movies = new ArrayList<>();

    public List<Movie> getGoodMoviesWithCategoryGiven(Category category) {
        List<Movie> filteredMovies = new ArrayList<>();
        for (Movie item : movies) {
            if (item.getCategory().equals(category) && item.getRating() > 3)
                filteredMovies.add(item);
        }
        return filteredMovies;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
