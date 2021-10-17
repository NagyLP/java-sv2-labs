package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a termék nevét: ");
            String productName = scanner.nextLine();
        System.out.println("Kérem, a termék árát: ");
            int productPrice = scanner.nextInt();

        Product product1 = new Product (productName, productPrice);

        System.out.println("A Product osztály jelenlegi állapota: -Termék neve: " + product1.getNAme()+ "  -Bevételezett ára: " + product1.getPRice()+ ",- űrkredit");
    System.out.println();
        System.out.println("Figyelem! Kérem a " + product1.getNAme()+ " árának növekedésének értékét: ");
        product1.increasePrice(scanner.nextInt());
        System.out.println("A Product osztály jelenlegi állapota: -Termék neve: " + product1.getNAme()+ "  -Jelenlegi ára: " + product1.getPRice()+ ",- űrkredit");
    System.out.println();
        System.out.println("Kérem a " + product1.getNAme()+ " árának csökkenésének értékét: ");
        product1.decreasePrice(scanner.nextInt());
        System.out.println("A Product osztály jelenlegi állapota: -Termék neve: " + product1.getNAme()+ "  -Jelenlegi ára: " + product1.getPRice()+ ",- űrkredit");
    }
}
