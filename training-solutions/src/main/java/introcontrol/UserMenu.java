package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Felhasználók listázása\n"+"2. Felhasználó felvétele\n"+"Többi: Kilépés");
        int menuNumber = sc.nextInt();

        if (menuNumber==1) {
            System.out.println("Felhasználók listázása");
        }
        if (menuNumber==2) {
            System.out.println("Felhasználó felvétele");
        }
    }
}
