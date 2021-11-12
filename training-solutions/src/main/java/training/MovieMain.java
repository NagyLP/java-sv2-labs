package training;

import java.util.ArrayList;
import java.util.List;

public class MovieMain {

    public static void main(String[] args) {
        Viewer viewer = new Viewer();
        Movie movie = new Movie("Óz", 1975);
        viewer.watchMovie(movie, 5);
        System.out.println(movie.getInfo());
        System.out.println(viewer.watchMovie(movie, 4));

        List<String> list = new ArrayList<>();
        for (String s: list) {System.out.println(s);}


    }
}
