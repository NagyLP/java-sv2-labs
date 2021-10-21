package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {

        System.out.println("Kérem adjon meg egy darab egész számot, és megvizsgálom háromoperandusú operátorral, h. osztható-e maradék nélkül 3-mal: ");
            Scanner sc = new Scanner(System.in);
            int integerDiv3 = sc.nextInt();
        System.out.println(integerDiv3 % 3 == 0 ? "Osztható" : "Nem osztható");
    }
}
