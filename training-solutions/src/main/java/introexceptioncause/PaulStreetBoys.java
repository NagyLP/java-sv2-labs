package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PaulStreetBoys {

    public static void main(String[] args) {
        new PaulStreetBoys().readAndPrintPaulStreetBoysNames();

    }

    private void readAndPrintPaulStreetBoysNames() {
        try {
            List<String> paulStreetBoys = Files.readAllLines(Paths.get("src/main/resources/palutcaifiuk.txt"));
            printBackStreetBoys(paulStreetBoys);
        } catch (IOException ioe) {
            throw new IllegalStateException("Errorrrr while readin...", ioe);
        }
    }

    private void printBackStreetBoys(List<String> paulStreetBoys) {
        for (String item : paulStreetBoys) {
            if (item.equals("Nemecsek Ernő")) {
                System.out.print(item.toLowerCase() + ", ");
            } else {
                System.out.print(item + ", ");
            }
        }
    }
}
