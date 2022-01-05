package meetingrooms;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MeetingRoomController {

    private final Office office = new Office();
    private final Scanner scan = new Scanner(System.in);
    private final Runtime runtime = Runtime.getRuntime();
    private boolean terminated;

    public static void main(String[] args) throws IOException {
        MeetingRoomController controllerMeetingRoom = new MeetingRoomController();
        try {
            while (!controllerMeetingRoom.terminated)
                controllerMeetingRoom.runMenu();
        } catch (IOException ioe) {
            System.out.println("-= Exeption =- : " + ioe);
        }
    }

    public void readOffice() {
        System.out.println("\nKérem a hozzáadni kívánt tárgyaló adatait.");
        System.out.print("A tárgyaló neve: ");
        String name = scan.nextLine();
        System.out.print("A tárgyaló hossza: ");
        int lenght = Integer.parseInt(scan.nextLine());
        System.out.print("A tárgyaló szélessége: ");
        int width = Integer.parseInt(scan.nextLine());

        office.addMeetingRoom(new MeetingRoom(name, lenght, width));
    }

    public void printMenu() {
        System.out.println("\n- TÁRGYALÓ NYILVÁNTARTÓ PROGRAM -\nKérem a kívánt funkcióhoz tartozó számot, és egy entert:");
        List<String> menuTargyalo = Arrays.asList(
                "1. Tárgyaló rögzítése",
                "2. Tárgyalók sorrendben",
                "3. Tárgyalók visszafele sorrendben",
                "4. Minden második tárgyaló",
                "5. Területek",
                "6. Keresés pontos név alapján",
                "7. Keresés névtöredék alapján",
                "8. Keresés terület alapján",
                "9. Kilépés \n"
        );
        for (String item : menuTargyalo) {
            System.out.println(item);
        }
    }

    public void runMenu() throws IOException {
        printMenu();

        int selection;
        try {
            selection = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException nfe) {
            selection = 0;
        }

        switch (selection) {
            case 1:
                readOffice();
                break;
            case 2:
                office.printNames();
                break;
// MIÉRT NEM TALÁLJA A pause.exe-t. runtime.exec("pause"), mert nincs olyan *.exe.
// Emlék: A command.com egyik internális (belső/beágyyazott) parancsa...
            case 3:
                office.printNamesReverse();
                break;
            case 4:
                office.printEvenNames();
                break;
            case 5:
                office.printAreas();
                break;
            case 6:
                System.out.print("\nKérem a keresendő tárgyaló pontos nevét: ");
                office.printMeetingRoomsWithName(scan.nextLine());
                break;
            case 7:
                System.out.print("\nKérem a keresendő tárgyaló(k) névtöredékét: ");
                office.printMeetingRoomsContains(scan.nextLine());
                break;
            case 8:
                System.out.println("\nKérem a keresendő tárgyaló(k) legkisebb területét: ");
                office.printAreasLargerThan(Integer.parseInt(scan.nextLine()));
                break;
            case 9:
                System.out.println("\n Köszönöm, hogy itt volt. Viszontlátásra... Shutdown Babe, shutdown.\n" +
                        "(Jó, nem az absz.max. 10 év múlva történik majd meg, hanem Magad választhatod ki.)");
                runtime.exec("shutdown -i");
                terminated = true;
                break;
            default:
                System.out.println("Hol van ilyen menüszám? Ezért Fatal Error és shutdown lenne," +
                        "de most enter után újramenü lesz.");
                scan.nextLine();
                break;
        }
    }
}
