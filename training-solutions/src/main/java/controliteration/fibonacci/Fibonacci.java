package controliteration.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az elemszámot, a kiiratandó Fibonacci-sorozatból.");
        int number = scanner.nextInt();
        scanner.nextLine();

        int[] fibonacci = new int[number + 2];
        fibonacci[1] = 1;
        for (int i = 0; i < number; i++) {
            int nextElement = fibonacci[i] + fibonacci[i + 1];
            fibonacci[i + 2] = nextElement;
            System.out.print(fibonacci[i] + ", ");
        }

//        int[] fibonacci = new int[number + 2];
//        fibonacci[1] = 1;
//        int i = 0;
//        do {
//            int nextElement = fibonacci[i] + fibonacci[i + 1];
//            fibonacci[i + 2] = nextElement;
//            System.out.print(fibonacci[i] + ", ");
//            i++;
//        } while (i < number);
    }
}
