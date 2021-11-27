package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {

    public static void main(String[] args) {

//        try {
//            List<String> namesAndCodesList = new Neptun().readNamesAndCodes();
//            System.out.println(namesAndCodesList);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//    }
//
//    public List<String> readNamesAndCodes() throws IOException {
//        return Files.readAllLines(Paths.get("src/main/resources/neptun.csv"));
//    }
//}

        Neptun neptun = new Neptun();
        List<String> namesAndCodes = new ArrayList<>();
        try {
            namesAndCodes = neptun.readNamesAndCodes();
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

    private List<String> readNamesAndCodes() throws IOException {
        Path path = Paths.get("src/main/resources/neptun.csv");
        List<String> namesAndCodes = Files.readAllLines(path);
        return namesAndCodes;
    }
}
