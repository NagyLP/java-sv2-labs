package A_Training;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            int anInt = scan.nextInt();
            double aDouble = scan.nextDouble();
            scan.nextLine();
            String aString = scan.nextLine();

            System.out.println(String.format(
                    "String: %s%n" +
                            "Double: %s%n" +
                            "Int: %d",
                    aString, aDouble, anInt));
        }
    }
}

