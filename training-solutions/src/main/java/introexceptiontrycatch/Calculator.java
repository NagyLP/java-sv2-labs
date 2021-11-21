package introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int firstNumber = 1;
         int secondNumber = 1;

        System.out.println("Kérem adjon meg kettő számot, majd a műveletet: ");

        System.out.println("Kérem az első számot: ");

        try {
            firstNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Nem értelmezhető számformátum. \n Alapértelmezett: 1");
        }

        System.out.println("Kérem a második számot: ");
        try {
            secondNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Nem értelmezhető számformátum. \n Alapértelmezett: 1");
        }

        System.out.println("Kérem, adja meg az elvégezni kívánt műveletet számát:");
        System.out.println("1. Összeadás\n" + "2. Kivonás\n" + "3. Szorzás\n" + "4. Osztás\n");
        String operation = scanner.nextLine();

        try {
            switch (operation) {
                case "1":
                    System.out.println("Végeredmény: " + (firstNumber + secondNumber));
                    break;
                case "2":
                    System.out.println("Végeredmény: " + (firstNumber - secondNumber));
                    break;
                case "3":
                    System.out.println("Végeredmény: " + (firstNumber * secondNumber));
                    break;
                case "4":
                    System.out.println("Végeredmény egész része: " + (firstNumber / secondNumber));
                    break;
                default:
                    System.out.println("Értelmezhetetlen műveletkód.");
            }
        } catch (ArithmeticException ae) {
            System.out.println("A \"0\"-val való osztás, nem értelmezhető művelet.");
        }
    }
}
