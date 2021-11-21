package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a nevét: ");
            String name = scanner.nextLine();
        System.out.println("Kérem a film címét, amelyikre a jegyet kéri: ");
            String title = scanner.nextLine();
        System.out.println("Kérem, adja meg mennyi jegyet rendel: ");
            int numberOfTicket = Integer.parseInt(scanner.nextLine());
        System.out.println("Kérem, adja meg a sor számát amelyik a jegyeket kéri: ");
            String line = scanner.nextLine();

        StringBuilder sb = new StringBuilder("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők: ");
        sb.append("\n").append("Vásárló neve: ").append(name+"\n").append(title+"\n").append("Lefoglalt helyek: ");
        for (int i = 1; i <= numberOfTicket; i++) {
            sb.append(line).append(". sor ").append(i).append(". szék");
            if (i<numberOfTicket) {
                sb.append(", ");
            }
        }
        sb.append("\n Jó szórakozást!");

        System.out.println(sb);
    }
}
