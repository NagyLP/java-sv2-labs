package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int akkumlator = 0;
        for (int i=0; i<5; i++) {
            System.out.println("Kérem a " +(i+1)+ ". egész számot.");
            int number = sc.nextInt();
            akkumlator += number;
        }
        System.out.println("Összeg: "+akkumlator);

    }
}
