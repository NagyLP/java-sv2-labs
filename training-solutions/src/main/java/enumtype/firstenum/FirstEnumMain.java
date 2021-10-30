package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {

    public static void main(String[] args) {

        Continent afrika = Continent.AFRIKA;
        Continent antartika = Continent.ANTARTIKA;
        Continent ázsia = Continent.ÁZSIA;
        Continent ausztrália = Continent.AUSZTRÁLIA;
        Continent európa = Continent.EURÓPA;
        Continent észak_amerika = Continent.ÉSZAK_AMERIKA;
        Continent dél_amerika = Continent.DÉL_AMERIKA;

        System.out.println(afrika.name());
        System.out.println(antartika.name());
        System.out.println(ázsia.name());
        System.out.println(európa.name());
        System.out.println(észak_amerika.name());
        System.out.println(dél_amerika.name());
        System.out.println(afrika.name());

        System.out.println();

        Continent[] continent = Continent.values();
        for (int i = 0; i < continent.length; i++) {
            System.out.println(continent[i].ordinal() + 1 + " : " + continent[i].name());
        }

        System.out.println();
        System.out.println(Arrays.toString(Continent.values()));
        System.out.println()
        ;

        Oceans[] oceans = Oceans.values();

        System.out.println(Oceans.valueOf("ATLANI_ÓCEÁN"));
//        System.out.println(Oceans.ATLANI_ÓCEÁN.toString());
//        System.out.println();
//        System.out.println(Oceans.valueOf("ATLANTI-ÓCEÁN"));
//        System.out.println();
        System.out.println(Oceans.valueOf("JEGES_TENGER"));
        System.out.println(Oceans.valueOf("CSENDES_ÓCEÁN"));
        System.out.println(Oceans.valueOf("INDIAI_ÓCEÁN"));

        System.out.println();

        for (int i = 0; i<Oceans.values().length; i++) {
            System.out.println(i+1 +": "+ Oceans.values()[i].getValues());
        }
        System.out.println();

        // TESSÉK A valueOF-al
        for (int i = 0; i<Oceans.values().length; i++) {
            System.out.println(i+1 +".: "+ Oceans.valueOf(Oceans.values()[i].name()));
        }
        System.out.println();

        System.out.println(Football.CSATÁR.name() + "," + Football.HÁTVÉD.name() + ", " + Football.KÖZÉPPÁLYÁS.name() + ", " + Football.KAPUS.name());
//HA SOK VAN
        for (int i = 0; i < Football.values().length; i++) {
            System.out.println(Football.values()[i].ordinal() + 1 + " : " + Football.values()[i].name());
        }
    }
}
