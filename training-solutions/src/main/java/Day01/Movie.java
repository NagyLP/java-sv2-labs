package Day01;

import java.util.ArrayList;
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
        for (Actor actor : actors) {
            if (this.movieDate - actor.getYearOfBirth() == 20) {
                reply++;
            }
        }
        return reply;
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Az", 1995);
        Actor actor1 = new Actor("János Pista", 1975);
        Actor actor2 = new Actor("Pista Jancsi", 1970);
        List<Actor> testList = new ArrayList<>();
        testList.add(actor1);
        testList.add(actor2);
        movie.addActor(actor1);
        movie.addActor(actor2);
        System.out.println(testList.size());
        System.out.println(movie.actors.size());
        System.out.println(movie.actorsInTheirTwenties());
        System.out.println(testList);
    }
}
