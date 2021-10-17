package classstructureconstructors;

import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Store storageRubberdoG = new Store("Gumikutya", 0);
            System.out.println("Kérem, a Gumikutya-Raktárban tárolt termék nevét: ... és egyet, mert nem tömb. ");
                storageRubberdoG.setpRoduct(scanner.nextLine());
            System.out.println("Kérem, a " +storageRubberdoG.getpRoduct()+ "-Raktárban tárolt termék kiinduló mennyiségét: ");
                storageRubberdoG.setsTock(scanner.nextInt());
                scanner.nextLine();
            System.out.println("Jelenlegi állapot: -Termék neve: " +storageRubberdoG.getpRoduct()+ "  -Jól eltárolt mennyiség: " +storageRubberdoG.getsTock()+ " db");

        System.out.println();

        Store storageRubberducK = new Store("Gumikacsa", 0);
            System.out.println("Kérem, a Gumikacsa-Raktárban tárolt termék nevét: ... és egyet, mert nem tömb.");
                storageRubberducK.setpRoduct(scanner.nextLine());
            System.out.println("Kérem, a " +storageRubberducK.getpRoduct()+ "-Raktárban tárolt termék kiinduló mennyiségét: ");
                storageRubberducK.setsTock(scanner.nextInt());
                scanner.nextLine();
            System.out.println("Jelenlegi állapot:  -Termék neve: " +storageRubberducK.getpRoduct()+ "   -Eltárolt mennyiség: " +storageRubberducK.getsTock()+ " db");

        System.out.println();
// Inicializálás/Állapotvált. Mr Konstuktőrrel (Szám +/-)
    // TERMÉK 1.:
            System.out.println("Kérem a " +storageRubberdoG.getpRoduct()+ "-Raktárba elraktározni kívánt mennyiséget: ");
            //Ez alatti MIÉRT fájt Neki, nem futott le, még nem tudja :-)? (Kattintással int-té kellett tenni, vizuál' semmi sem változott.)
                storageRubberdoG.store(scanner.nextInt());
                System.out.println(storageRubberdoG.getpRoduct()+" termékből a jelenlegi készlet: " +storageRubberdoG.getsTock()+ " valami mennyiségi egység");
        System.out.println();
            System.out.println("Kérem a " +storageRubberdoG.getpRoduct()+ "-Raktárból kivételezni kívánt mennyiséget: "  );
                storageRubberdoG.dispatch(scanner.nextInt());
            System.out.println("A " +storageRubberdoG.getpRoduct()+ "-Raktárban tárolt " +storageRubberdoG.getpRoduct()+ " megnevezésű termék jelenlegi készlete: " +storageRubberdoG.getsTock()+ " db");

        System.out.println();

    // ok TERMÉK 2.:
            System.out.println("Kérem a " +storageRubberducK.getpRoduct()+ "-Raktárba elraktározni kívánt mennyiséget: ");
                storageRubberducK.store(scanner.nextInt());
        System.out.println(storageRubberdoG.getpRoduct()+" termékből a jelenlegi készlet: " +storageRubberdoG.getsTock()+ " valami mennyiségi egység");
        System.out.println();
        System.out.println("Kérem a " +storageRubberdoG.getpRoduct()+ "-Raktárból kivételezni kívánt mennyiséget: "  );
        storageRubberdoG.dispatch(scanner.nextInt());
        System.out.println("A " +storageRubberdoG.getpRoduct()+ "-Raktárban tárolt " +storageRubberdoG.getpRoduct()+ " megnevezésű termék jelenlegi készlete: " +storageRubberdoG.getsTock()+ " db");
    }
}
