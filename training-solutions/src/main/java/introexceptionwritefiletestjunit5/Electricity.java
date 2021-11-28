package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {

    public void writeStreets(Path path) {
        List<String> streets = new ArrayList<>();
        try {
            Files.write(path, streets);
        } catch (IOException ioe) {
            throw new IllegalStateException("Error writing file", ioe);
        }
    }

    private List<String> getListOfStreets() {
        List<String> streets = new ArrayList<>();
        streets.add(LocalDate.now().toString());
        streets.add("Arany J. utca");
        streets.add("Kossuth L. utca");
        streets.add("Petőfi S. utca");
        return streets;
    }
}
