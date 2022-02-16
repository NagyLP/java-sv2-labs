package SQL.week17.day02;

import java.time.LocalDate;

public class Movie {

    private final long id;
    private final String title;
    private final LocalDate release_date;

    public Movie(long id, String title, LocalDate release_date) {
        this.id = id;
        this.title = title;
        this.release_date = release_date;
    }

    @Override
    public String toString() {
        return "Movie: " +
                "\n  id: " + id +
                "\n  title: '" + title + '\'' +
                "\n  release_date: " + release_date;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getRelease_date() {
        return release_date;
    }
}
