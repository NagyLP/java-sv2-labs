package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client kliens = new Client();

    System.out.println("Kérem a nevét: ");
        kliens.name = scanner.nextLine();
    System.out.println("Kérem a születési évét: ");
        kliens.year = scanner.nextInt();
        scanner.nextLine();
    System.out.println("Kérem a bejelentett állandó lakcímét: ");
        kliens.adress = scanner.nextLine();

    System.out.println("A következő adatokat adta meg nekem: ");
        System.out.println("Név: " + kliens.name);
        System.out.println("Év: " + kliens.year);
        System.out.println("Cím: " + kliens.adress);
        System.out.println("Ha a Client (adat-változó?)osztály, névargumentumai második kezdőbetűit egybeolvassuk, akkor Évi. Stimm? :-)");
    }
}
