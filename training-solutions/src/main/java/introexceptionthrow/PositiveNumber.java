package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, pötyögjön be egy \"+\" számot: : ");
        String data = scanner.nextLine();
        char[] dataChars = data.toCharArray();
        for (int i = 0; i < dataChars.length; i++) {
            if (!Character.isDigit(dataChars[i])) {
                throw new IllegalArgumentException("Ez nem pozitív szám: " + dataChars);
            }
        }
    }
}
