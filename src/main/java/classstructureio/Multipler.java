package classstructureio;

import java.util.Scanner;

public class Multipler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Úgy összeszorzok kettő egész számot, mint a pinty, és még meg is adhatod értéküket, úgy ~2,1 millióig.");
        System.out.println("Kérem az első számot:");
            int elsoSzam = scanner.nextInt();
        System.out.println("Szoktál zenét hallgatni kódolás közben, amúgy, meddig várjak a második számra?:");
            int masodikSzam = scanner.nextInt();
        System.out.println(elsoSzam+" * "+masodikSzam+" = "+elsoSzam*masodikSzam);

    }

}
