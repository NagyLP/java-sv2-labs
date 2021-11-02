package characters;

import java.util.Arrays;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem legépeltetni kívánt szó: ");
        String word = sc.nextLine();
        System.out.println("Figyelem T. Lurkók, érkezik a szó, amit le kell majd gépelni, majd megjelenik betünként.\n" + word);

        char[] wordChars = new char[word.length()];
        wordChars = word.toCharArray();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(wordChars[i]);
            wordChars[i] = sc.nextLine().toCharArray()[0];
        }

        System.out.println("Most, ugrik majom a vízbe?.\n Bevitt Karak-terek: " + Arrays.toString(wordChars)+"\n");

        String miertNemMukodikMegTombToStringgelSem = new String(wordChars);

        if (word.equals(miertNemMukodikMegTombToStringgelSem)) {
            System.out.println("Gratula! A megoldás helyes.");
        } else {
            System.out.println("Sajnos, nem jól oldotta meg a feladatot, most, de legközelebb 100, h. jó lesz.");
        }
        System.out.println("Ez volt a megadott szó: " +word);
    }
}
