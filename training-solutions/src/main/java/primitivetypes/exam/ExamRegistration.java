package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exam exam = new Exam();

        System.out.println("A záróvizsgára történő regisztrációhoz kérem a következő adatokat");
        System.out.println("Neve: ");
            String name = sc.nextLine();
        System.out.println("Születési éve: ");
            short birthDYear = sc.nextShort();
            sc.nextLine();
        System.out.println("Születésének hón apja:");
            byte birthDMonth = sc.nextByte();
            sc.nextLine();
        System.out.println("Születésének n apja: ");
            byte birthDDay = sc.nextByte();
            sc.nextLine();
        System.out.println("Kérem a postai irányítószámot: ");
            int postNumber = sc.nextInt();
        System.out.println();
        System.out.println("Kérem a tanulmányi átlagot: ");
            double average = sc.nextDouble();

        LocalDate birtDate = LocalDate.of(birthDYear, birthDMonth, birthDDay);
        Person person = new Person(name, birtDate, postNumber, average);

        System.out.println(person);
        exam.addPerson(person);
        System.out.println(exam.getPersonList());


    }
}
