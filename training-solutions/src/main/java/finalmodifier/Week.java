package finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {
    public static final List<String> HÉT_NAPJAI = Arrays.asList("Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap");

    public static void main(String[] args) {
        HÉT_NAPJAI.set(1, "Szerda");
        System.out.println(HÉT_NAPJAI);
    }
}
