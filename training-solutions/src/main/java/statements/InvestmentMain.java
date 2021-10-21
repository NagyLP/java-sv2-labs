package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem a befektetni kívánt összeget: ");
        int funD = sc.nextInt();
        System.out.println("Kérem a befektetés éves hozamát (%): ");
        int interestRatE = sc.nextInt();

        Investment investmenT = new Investment(funD, interestRatE);

        System.out.println("Befektetés összege:");
        System.out.println(investmenT.getFund());
        System.out.println("Kamatláb:");
        System.out.println(interestRatE + " %");
        System.out.println("Tőke: " + investmenT.getFund());
        System.out.println("Kérem, a kivétel napját a hozam megállapításához: ");
        int dayS = sc.nextInt();
        System.out.println("Hozam " + dayS + " napra: " + investmenT.getYield(dayS));

        System.out.println("Kérem, mennyi nap után kívánja kivételezni: ");
        int daYS = sc.nextInt();
        System.out.println("Kivett összeg " +daYS+ " nap után: " +investmenT.close(daYS));
        System.out.println("Kivett összeg " +daYS+ " nap után: " +investmenT.close(daYS));
    }
}
