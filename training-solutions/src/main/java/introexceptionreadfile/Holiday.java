package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {

    public static void main(String[] args) {

        try {
            List<String> names = Files.readAllLines(Paths.get("src/main/resources/holiday.txt"));
            System.out.println(names);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
