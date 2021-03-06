package introcontrol;

import java.util.Random;

public class IntroControl {

    public int subtractTenIfGreater(int number) {
        if (number > 10) {
            return number - 10;
        } else {
            return number;
        }
    }

    public String describeNumber(int number) {
        if (number == 0) {
            return "zero";
        } else {
            return "not zero";
        }
    }

    public String greetingToJoe(String name) {
        if (name.equals("Joe")) {
            return "Hello Joe";
        } else {
            return "";
        }
    }

    public int calculateBonus(int sale) {
        if (sale >= 1000000) {
            return (sale / 10);
        } else {
            return 0;
        }}

    public int calculateConsumption(int prev, int next) {
        if (next-prev<10000) {
            return next-prev;
        } else {
            return ((next-prev)-(((next-prev)/10_000)*10_000));
          }}

    public void printNumbers(int max) {
        for (int i=0; i<=max; i++);

/** HIBA IDEA "i" piros aláhúzás, mást main-t nem futtat.*/

        System.out.println("i");
    }

    public void printNumbersBetween(int min, int max) {
        for (int i =min; i<=max; i++);
        System.out.println("i");
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) ;
            System.out.println("i");
        } else {
            for (int i = a; i >= b; i--) ;
            System.out.println("i");
        }
    }
    public void printOddNumbers(int max) {
        if (max>1) {
            for (int i=1; i<=max; i=i+2);
            System.out.println("i");
        } else {
            System.out.println(max);
        }

    }

}
