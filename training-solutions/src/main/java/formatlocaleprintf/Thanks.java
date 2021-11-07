package formatlocaleprintf;

import java.util.*;

public class Thanks {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Jane", "Jack", "Joe"));

        for (String item : names) {
            System.out.printf("Kedves %s! Örülünk, hogy a termékünket válaszotta!\n", item);
        }
    }
}
