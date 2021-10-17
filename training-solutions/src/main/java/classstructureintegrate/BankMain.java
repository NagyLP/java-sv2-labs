package classstructureintegrate;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a számlatulajdonos nevét: ");
        String ownerN = scanner.nextLine();

        System.out.println("Kérem a számlaszámot: ");
        String accountNumberN = scanner.nextLine();

        System.out.println("Kérem az egyenleget: ");
        int balanceN = scanner.nextInt();

    BankAccount bankAccount = new BankAccount(accountNumberN, ownerN, balanceN);

        System.out.println("A következő adatokat rögzítetem: " +bankAccount.getInfo());

        System.out.println("Kérem a számlára befizetni kívánt összeget: ");
        bankAccount.deposit(scanner.nextInt());
        System.out.println("Áll a pot: " +bankAccount.getInfo());

        System.out.println("Kérem a számláról kifizetni kívánt summát: ");
        bankAccount.withdraw(scanner.nextInt());
        System.out.println("Áll a pot: "+bankAccount);

    }
}
