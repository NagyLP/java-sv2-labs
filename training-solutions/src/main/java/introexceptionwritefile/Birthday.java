package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> birthdays = new ArrayList<>();
        int numberOfBirthday = 0;

        System.out.println("Kérem lesszives' megadni mennyi születésnapot kíván tárolni: (Értelemszerűen a \"0\" érték kilép, de fájlt létrehoz, mert így rövidebb... :-))");

        try {
            numberOfBirthday = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Not a number.", nfe);
        }

        for (int i = 0; i < numberOfBirthday; i++) {
            System.out.println("Név: ");
            String name = scanner.nextLine();
            System.out.println("Születésnap: ");
            String birthday = scanner.nextLine();
            birthdays.add(name + ": " + birthday);
        }

        try {
            Files.write(Paths.get("src/main/resources/birthdays.txt"), birthdays);
        } catch (IOException ioe) {
            throw new IllegalStateException("Error while writening...", ioe);
        }
    }
}
