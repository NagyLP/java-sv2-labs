package stringscanner;

import java.util.Scanner;

public class StringScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem a mondatot, amely több tagmondatból áll, és azokat ugyazaz a karaktersorozat (pl.: vessző, és szóköz) választja el egymástól. ");
        String said = sc.nextLine();

        Scanner saidByWord = new Scanner(said).useDelimiter(", ");

    while (saidByWord.hasNext()) {
        System.out.println(saidByWord.next());
    }
        System.out.println();


    }

}
