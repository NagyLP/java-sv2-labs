package classstructuremethods;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client KLiens = new Client();

    System.out.println("Kérem a nevét: ");
        KLiens.setName(scanner.nextLine());
    System.out.println("Kérem a születési évét: ");
        KLiens.setYear(scanner.nextInt());
        scanner.nextLine();
    System.out.println("Kérem a lakcímét: ");
        KLiens.setAddress(scanner.nextLine());
    System.out.println();
// Ellenőrzés
    System.out.println("A következő adatokkal szédített engem:");
        System.out.println();
        System.out.println("Rögzített név: " + KLiens.getName());
        System.out.println("Rögzített születési év: " + KLiens.getYear());
        System.out.println("Rögzített lakcím: " + KLiens.getAddress());
        System.out.println();
//Változás-felülírás
    System.out.println("Köszönöm. Szombat AM 09:00-kor a címen van az egész cég házavatót tartani. Na jó, kérem az új címet: ");
        KLiens.migrate(scanner.nextLine());
        System.out.println();
        System.out.println("Módosult lakcím: " + KLiens.getAddress() + " <- erre.");
    }
}
