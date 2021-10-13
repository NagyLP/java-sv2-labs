package classstructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Note notepad = new Note();

    System.out.println("Kérem a felhasználó nevét: ");
        notepad.setName(scanner.nextLine());
    System.out.println("Kérem jegyzet témáját: ");
        notepad.setTopic(scanner.nextLine());
    System.out.println("Kérem a jegyzet szövegét: ");
        notepad.setText(scanner.nextLine());

    System.out.println("Köszönöm.");
        System.out.println("Az első bejegyzés adatai a következők:");
        System.out.println();
        System.out.println(notepad.getNoteText());

    }
}
