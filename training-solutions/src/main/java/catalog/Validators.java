package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String text) {
        return text == null || text.isBlank();
    }

    public static boolean isEmpty(List<String> text) {
        return text == null || text.isEmpty();
    }
}
