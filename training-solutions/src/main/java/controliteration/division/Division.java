package controliteration.division;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int number = sc.nextInt();

        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int divisor = sc.nextInt();

//       for (int i = 1; i < number; i++) {
//            if (i % divisor == 0) {
//                System.out.print(i + ", ");
//            }
//        }

        int i = 1;
        while (i < number) {
            if (i % divisor == 0) {
                System.out.print(i +", ");
            }
        }
    }
}
