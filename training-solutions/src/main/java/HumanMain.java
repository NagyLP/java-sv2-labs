import java.util.Scanner;

public class HumanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a nevet: ");
        String name = scanner.nextLine();

        System.out.println("Kérem az életkort: ");
        int age = scanner.nextInt();

        Human humanN = new Human(name, age);

        System.out.println("A következő adatokat rögzítetem: " +humanN.getInfo());
    }
}
