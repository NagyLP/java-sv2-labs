package numbers;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem a következő kifejezés -decimális ábrázolási tartományban, négy tizedesjeggyel kifejezett- eredményét.");
        System.out.println("5*5+(5+5)/5.5-5");

        double tip = sc.nextDouble();
                sc.nextLine();
        double solution = 5*5+(5+5)/5.5-5;

        if (Math.abs(solution-tip)<0.0001) {
            System.out.println("Durva vagy... - Bingó! ");
        } else {
            System.out.println("Semmi gond, végtelen tizedesjegyű.");
        }
    }
}
