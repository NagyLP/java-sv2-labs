package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

import java.util.Scanner;

public class NameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem az előtagot: ");
        String pre = sc.nextLine();
        System.out.println("Kérem a vezetéknevet: ");
        String first = sc.nextLine();
        System.out.println("Kérem a utó_nevet: ");
        String last = sc.nextLine();

        Prefix prefix = new Prefix(pre);
        FirstName firstName = new FirstName(first);
        LastName lastName = new LastName(last);

/** Melyik, mikor a célszerű(bb)? * */
        System.out.println(pre+ " " +first+ " " +last+ " ezeket adta meg.");
        System.out.println(prefix.getPre()+ " " + firstName.getFirst()+ " " + lastName.getLastname()+ " ezeket adta meg.");

    }
}
