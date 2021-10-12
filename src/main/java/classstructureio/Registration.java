package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adja meg a nevét: (... de \"UTF-8\"-ban ám.)");
        String name = scanner.nextLine();

        System.out.println("Kérem, adja az email címét:");
        String email = scanner.nextLine();

        System.out.println("Alábbi adatokkal regisztrált:");
        System.out.println("Név: " +name);
        System.out.println("Email: " +email);
    }
}
