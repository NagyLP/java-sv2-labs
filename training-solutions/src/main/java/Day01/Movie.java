package Day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movie {

    private String movieName;
    private int movieDate;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String movieName, int movieDate) {
        this.movieName = movieName;
        this.movieDate = movieDate;
    }

    public void addActor (Actor actor) {
        actors.add(actor);
    }

    public int actorsInTheirTwenties() {
        int reply = 0;
        for (int i =0; i<actors.size(); i++) {
            if (actors.get(i).getYearOfBirth()-movieDate == 20) {
                reply++;
            }
        }
        return reply;
    }
}
