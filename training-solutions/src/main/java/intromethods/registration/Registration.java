package intromethods.registration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.SortedMap;

public class Registration {

    public String getNamePlus(String firstname, String lastname) {return firstname + " " + lastname;}
    public LocalDate getBirthDatePlus(int year,int month, int day) {return LocalDate.of( year, month, day);}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Registration registration = new Registration();

        System.out.println("Kérem vezeték a neved?: ");
            String firstname = sc.nextLine();
        System.out.println("Kérem kereszt a neved?: ");
            String lastninja = sc.nextLine();

        System.out.println("Kérem a születési évet: ");
            int year = sc.nextInt();
            sc.nextLine();
        System.out.println("Kérem a születési hónapot: ");
            int month = sc.nextInt();
            sc.nextLine();
        System.out.println("Kérem a születési 'papot: ");
            int day = sc.nextInt();
            sc.nextLine();

        System.out.println("Kérem tisztelettel (villám sebesen) az e-mail címet: ");
            String email = sc.nextLine();

        System.out.println("\n Gratulálunk! A következő (kamu)adatokkal regisztrált:\n");

        Person person1 = new Person(registration.getNamePlus(firstname, lastninja), registration.getBirthDatePlus(year,month, day),email);
        System.out.println(person1.toString());
    }

}
