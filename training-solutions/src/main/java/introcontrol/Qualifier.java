package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy számot, és kiírom nagyobb-e 100-nál: ");
        double number = sc.nextDouble();
        if (number>100) {
            System.out.println("Nagyobb, mint száz. Ügyes vagyok, double-ig?");
        } else {
            System.out.println("Száz, vagy kisebb. Hidd csak el.");
          }
    }
}
