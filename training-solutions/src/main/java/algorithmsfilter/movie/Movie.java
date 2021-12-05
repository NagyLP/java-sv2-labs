package algorithmsfilter.movie;

import jdk.jfr.Category;

public class Movie {

    private String title;
    private Category category;
    private int rating;

    public Movie(String title, Category category, int rating) {
        this.title = title;
        this.category = category;
        this.rating = rating;
    }

    public Movie(String titanic, algorithmsfilter.movie.Category romantic, int rating) {
    }

    public int getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public Category getCategory() {
        return category;
    }
}
