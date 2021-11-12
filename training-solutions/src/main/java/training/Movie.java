package training;

public class Movie {

    private final String title;
    private final int relaseYear;
    private double userRating;
    private int totalUserRating;
    private int totalUserRatingScore;

    public Movie(String title, int relaseYear) {
        this.title = title;
        this.relaseYear = relaseYear;
    }

    public double rating (int rating) {
        totalUserRating++;
        totalUserRatingScore += rating;
        return userRating = (double) totalUserRatingScore / totalUserRating;
    }

    public String getInfo() {
        return title + " - " + relaseYear + " - Rating: " +userRating;
    }

    public String getTitle() {
        return title;
    }

    public int getRelaseYear() {
        return relaseYear;
    }

    public double getUserRating() {
        return userRating;
    }
}
