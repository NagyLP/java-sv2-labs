package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song Zeneszamok = new Song();

        System.out.println("Kérem a dal előadó brigádját: ");
    Zeneszamok.band = scanner.nextLine();
        System.out.println("Kérem a dal címét: ");
    Zeneszamok.title = scanner.nextLine();
        System.out.println("Kérem a dal hosszát, milliméter helyett, másodpercben: ");
    Zeneszamok.length = scanner.nextInt();
        scanner.nextLine();
    int perc = Zeneszamok.length / 60;
    int masodperc = Zeneszamok.length - (perc * 60);

/* Vajon hol érdemes a számítások forráskódjait tárolni (jelen esetben; általánosan; speckó esetekben)???
        Az "osztálybirtokon, vagy -teremben" (Song), vagy külön pl.: Math osztályban, esetleg direkben egysorban, ill. mikor hol (pl.: teszt)?  */

        System.out.println("A következő adatokat tároltam el a muzsikáról: ");
        System.out.println("Szerző: " +Zeneszamok.band+ " - Cím: " +Zeneszamok.title+ "    " +perc+ " perc : " +masodperc+ "másodperc");
    }
}
