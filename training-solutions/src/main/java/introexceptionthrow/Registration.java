package introexceptionthrow;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        boolean registrationSucces = true;


        System.out.println("Üdvözlöm T. Felhasználó!");

        System.out.println("Kérem a nevét: ");
        String userName = scanner.nextLine();
        try {
            validation.validateName(userName);
        } catch (IllegalArgumentException iae) {
            registrationSucces = false;
            System.out.println(iae.getMessage());
        }

        System.out.println("Kérem az Élet korát: ");
        String userAge = scanner.nextLine();
        try {
            validation.validateAge(userAge);
        } catch (IllegalArgumentException iae) {
            registrationSucces = false;
            System.out.println(iae.getMessage());
        }


        System.out.println();
        System.out.println("A következő adatokat adta meg: ");
        System.out.println("Név: " + userName + "\nÉletkor: " + userAge);
        System.out.println();

        if (registrationSucces) {
            System.out.println("Kérjük fogadja üdvözítő gratulációnkat, a regisztráció: SIKERES.");
        } else {
            System.out.println("Mérhetetlenül sajnáljuk, a regisztráció: NEM SIKERES.");
        }
    }
}
