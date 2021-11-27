package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {

    public static void main(String[] args) {

        List<String> namesAndCodes = new ArrayList<>();
        try {
            List<String> namesAndCodesList = new Neptun().readNamesAndCodes();
        } catch (IOException ioe) {
            System.out.println("Error while reading file.");
        }

        List<String> codes = new ArrayList<>();
        for (String item : namesAndCodes) {
            String[] temp = item.split(", ");
            codes.add(temp[1]);
        }
        System.out.println(codes);
    }

    public List<String> readNamesAndCodes() throws IOException {
        return Files.readAllLines(Paths.get("src/main/resources/neptun.csv"));
    }
}
