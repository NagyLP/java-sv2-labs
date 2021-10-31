package numbers;

import java.util.Scanner;

public class Percent {

    public double getValue(int number, int percent) {
        return number * percent / 100.0;
    }

    public double getBase(int number, int percent) {
        return number * 100.0 / percent;
    }

    public double getPercent(int numberFirst, int numberSecond ) {
        return numberSecond*100.0/numberFirst;
    }

//    __________________________________________________________________________________________________________________

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Percent percent = new Percent();

        System.out.println("Kérem a számot (alap) aminek a százalékát kívánjuk megismerni, entert, majd a kívánt százaléklábat+entert: ");
        System.out.println(percent.getValue(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()))+"\n");

        System.out.println("Kérem a számot aminek az egész részét kívánjuk megismerni (százalékérték), entert, majd a kívánt százaléklábat+entert: ");
        System.out.println(percent.getValue(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()))+"\n");

        System.out.println("Kérem az 1. számot aminek a másodikhoz viszonyított százalékos arányát meg kívánjuk ismerni, entert, majd a kívánt 2. számot +entert: ");
        System.out.println(percent.getValue(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())) +" %"+ "\n");
    }
}
