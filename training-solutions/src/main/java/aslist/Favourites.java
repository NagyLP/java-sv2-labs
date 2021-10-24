package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> favouriteThings = new ArrayList<>();

        System.out.println("Kérem a kedvenc filmjét: ");
        favouriteThings.add(sc.nextLine());

        System.out.println("Kérem a kedvenc színészét: ");
        favouriteThings.add(sc.nextLine());

        System.out.println("Kérem a kedvenc állatát: ");
        favouriteThings.add(sc.nextLine());

        System.out.println("Kérem a kedvenc asztrofizikusát: ");
        favouriteThings.add(sc.nextLine());

        System.out.println(favouriteThings.size());
        System.out.println(favouriteThings);
    }
}
