package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserValidator userValidatoR = new UserValidator();

        System.out.println("Kérem a felhasználónevet: ");
            String username = sc.nextLine();
        System.out.println("Kérem a jelszót: ");
            String password1 = sc.nextLine();
        System.out.println("Kérem a jelszót ismét: ");
            String password2 = sc.nextLine();
        System.out.println("Kérem az email címet: ");
            String emailAdress = sc.nextLine();

        System.out.println("Megadott felhasználónév: ");
        System.out.println(userValidatoR.isValidUsername(username) ? " helyes " : " helytelen ");
        System.out.println("Megadott jelszavak: ");
        System.out.println(userValidatoR.isValidPassword(password1, password1) ? " helyes " : " helytelen ");
        System.out.println("Megadott e-mail cím:");
        System.out.println(userValidatoR.isValidEmail(emailAdress) ? " helyes " : " helytelen ");
    }
}
