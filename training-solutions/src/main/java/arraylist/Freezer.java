package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {

        List<String> bevasarloLista = new ArrayList<>();

          bevasarloLista.add("Kenyér");
          bevasarloLista.add("Tej");
          bevasarloLista.add("Tej");
          bevasarloLista.add("Vaj");
          bevasarloLista.add("1 kg Mozart tallér");

        System.out.println(bevasarloLista);
        System.out.println(bevasarloLista.size());
          bevasarloLista.add("Mikulás");
        System.out.println(bevasarloLista);
        System.out.println(bevasarloLista.size());
    }
}
