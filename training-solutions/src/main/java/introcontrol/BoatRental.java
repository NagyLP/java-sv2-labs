package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        int boat1passanger = 5;
        int boat2passanger = 3;
        int boat3passanger = 2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Mennyi személynek szükséges csónak?");
        int numberOfPassanger = sc.nextInt();

        int freePlaces=10;
        int freeBoats = 3;

        if (numberOfPassanger > boat1passanger) {
            numberOfPassanger = numberOfPassanger - boat1passanger;
            freeBoats--;
            freePlaces = freePlaces - boat1passanger;
        }
        if (numberOfPassanger > boat2passanger) {
            numberOfPassanger = numberOfPassanger - boat2passanger;
            freeBoats--;
            freePlaces = freePlaces - boat2passanger;
        }
        if (numberOfPassanger > boat3passanger) {
            numberOfPassanger = numberOfPassanger -2;
            freeBoats--;
            freePlaces = freePlaces-2;
        }

        if (numberOfPassanger>0) {
            System.out.println("Maradnak a parton.");
        } else {
            System.out.println("Fennmaradó üres helyek: " +freePlaces);
            System.out.println("Fennmaradó csónakok száma: " +freeBoats);
        }
    }
}
