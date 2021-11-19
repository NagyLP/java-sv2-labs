package controliteration.exit;

import java.util.Scanner;

public class Exit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = ".";

        do {
        System.out.println("\n Az ügyfélszolgálat menüje jelenleg nem elérhető. \n Kilépés: x billentyű megnyomásával");
        input = sc.nextLine().toLowerCase();
        } while (!input.equals("x"));
    }
}
