package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adjon meg egy legfeljebb 5 betűs szót: ");
        String word = scanner.nextLine();

        if (word.length() > 5) {
            throw new IllegalArgumentException("A szó túl hosszú!");
        }
          else {
            char[] charsOfWord = word.toCharArray();
            for (char item : charsOfWord) {
                if (!Character.isLetter(item)) {
                    throw new IllegalArgumentException("Nem szó: " +word);
                }
            }
        }
        System.out.println("A megadott szó: " +word);
    }
}
