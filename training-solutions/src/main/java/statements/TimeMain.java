package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem az 1. időszámítás időpontjának óráját: ");
            int horus1 = sc.nextInt();
        System.out.println("Kérem az 1. időszámítás időpontjának percét: ");
            int minutes1 = sc.nextInt();
        System.out.println("Kérem az 1. időszámítás időpontjának másodpercét: ");
            int seconds1 = sc.nextInt();

        System.out.println("Kérem az 2. időszámítás időpontjának óráját: ");
            int horus2 = sc.nextInt();
        System.out.println("Kérem az 2. időszámítás időpontjának percét: ");
            int minutes2 = sc.nextInt();
        System.out.println("Kérem az 2. időszámítás időpontjának másodpercét: ");
            int seconds2 = sc.nextInt();

        Time time1 = new Time(horus1, minutes1, seconds1);
        Time time2 = new Time(horus2, minutes2, seconds2);
    }
}
