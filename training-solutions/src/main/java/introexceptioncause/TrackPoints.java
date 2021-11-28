package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {

    public List<String> readTrackPoint() {
        try {
            return Files.readAllLines(Paths.get("src/main/resources/tracking.csv"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Error while reading...", ioe);
        }
    }

    public void printHeights(List<String> tracking) {
        List<Integer> heights = new ArrayList<>();
        for (String item : tracking) {
            String[] tmp = item.split(";");
            heights.add(Integer.parseInt(tmp[2]));
        }
        print(heights);
    }

    private void print(List<Integer> heights) {
        for (int i = 0; i < heights.size() - 1; i++) {
            System.out.print(heights.get(i + 1) - heights.get(i) + "; ");
        }
    }
}

