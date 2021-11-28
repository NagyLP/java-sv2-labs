package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoadMap {

    public static void main(String[] args) throws IOException {
        List<String> roadMap = new ArrayList<>(Arrays.asList("Budapest", "Budaörs", "Érd", "Diósd"));
        try {
            Files.write(Paths.get("src/main/resources/roadmap.txt"), roadMap);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

//        System.out.println(Files.readAllLines(Paths.get("src/main/resources/roadmap.txt")));
    }
}
