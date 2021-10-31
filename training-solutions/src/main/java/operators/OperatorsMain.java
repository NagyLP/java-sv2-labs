package operators;

import java.util.Arrays;
import java.util.Scanner;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators = new Operators();

        Scanner sc = new Scanner(System.in);

        System.out.println(operators.number+"\n");

        System.out.println("Kérem a megvizsgálandó számot: ");
        System.out.println(operators.isEvent(sc.nextInt())+""+"\n");
//        sc.nextLine();

        System.out.println("Kérem az osztandót, egy entert, majd az osztót, és szintén egy entert: ");
        System.out.println(operators.getResultOfDivision(sc.nextInt(), sc.nextInt())+"\n");

        System.out.println(operators.isNull(null));
        System.out.println(operators.isNull("0"));
        System.out.println(operators.isNull(""));
        System.out.println(operators.isNull(operators.number));

        System.out.println(operators.isEmpty(""));
        System.out.println(operators.isEmpty(null));
        System.out.println(operators.isEmpty("Nem null.")+"\n");
    }
}
