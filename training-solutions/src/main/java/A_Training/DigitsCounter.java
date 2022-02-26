package A_Training;

import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {

    public int getCountOfDigits(String s) {
        if (s == null || s.isBlank()) {
            throw new IllegalArgumentException("ERROR - Input is null: " + s);
        }
        Set<Character> inputChars = new HashSet<>();
        for (char chars : s.toCharArray()) {
            if (Character.isDigit(chars)) {
                inputChars.add(chars);
            }
        }
        return inputChars.size();
    }

    // JF Kollekciók DUPLIKÁCIÓK engedélyezése, ill. tiltása...
}
