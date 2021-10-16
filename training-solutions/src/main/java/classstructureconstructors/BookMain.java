package classstructureconstructors;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Book book1 = new Book ();
          System.out.println("Kérem, adja meg a könyv szerzőjét: ");
            book1.setAuthor(scanner.nextLine());
          System.out.println("Kérem, adja meg a könyv címét: ");
            book1.setTitle(scanner.nextLine());
        book1.register(1);

        System.out.println();

        System.out.println("Nyilvántartásba vételhez a következő adatokat adta meg: ");
          System.out.println("A könyv szerzője(i): " +book1.getAuthor());
          System.out.println("A Könyv címe: " +book1.getTitle());
          System.out.println("Regisztrációs szám: " +book1.getRegNumber());
        System.out.println("Egy, mert ez és kész.");
    }
}
