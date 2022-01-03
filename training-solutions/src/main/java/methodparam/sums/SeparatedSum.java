package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SeparatedSum {

    public String readFromFile() {
        try {
            List<String> floatingNumbers = Files.readAllLines(Paths.get("src/test/resources/floatingnumbers.txt"));
            return floatingNumbers.get(0);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }


    }


}
