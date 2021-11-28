package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Poem {

    public static void main(String[] args) {
        try {
            List<String> poem = Files.readAllLines(Paths.get("src/main/resources/poem.txt"));
            for (String item : poem) {
                System.out.print(item.charAt(0));
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Error while reading.", ioe);
        }
    }
}
