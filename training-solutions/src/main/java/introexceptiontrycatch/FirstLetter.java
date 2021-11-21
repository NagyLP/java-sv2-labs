package introexceptiontrycatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLetter {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Első szó", "Második szó", "Harmaik szó", null, "Hatodik szó"));

        try {
            for (String item : words) {
                System.out.println(item.charAt(0));
            }
        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
        }
    }
}
