package aslist;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Island {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Island island = new Island();
        List<String> importantThings = Arrays.asList("Mélység tarisznyája", "Bear Grylls forgatóstáb", "Kés");

        System.out.println("\n A kiválaszott három dolog: " +importantThings);
        System.out.println();
        System.out.println("Egy dolgot lecserélhetsz, melyik legyen az? (...de pontosan kérem ám...)");
        String outThing = sc.nextLine();
        System.out.println("Mire csere: ?");
        String inThing = sc.nextLine();
        importantThings.set(importantThings.indexOf(outThing), inThing);
        System.out.println("Tehát, ezek kísérnek utadon: " +importantThings);
    }
}
