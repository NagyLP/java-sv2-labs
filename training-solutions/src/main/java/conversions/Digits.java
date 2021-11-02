package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {

    private final List<Integer> numbersList = new ArrayList<>();

    private void addDigitsToList(String text) {
        char[] transformers = text.toCharArray();
        for (char item : transformers) {
            if(Character.isDigit(item)) {
            int number = Integer.parseInt(java.lang.String.valueOf(item));
                numbersList.add(number);
            }
        }
    }
    public List<Integer> getNumbers() { return numbersList;}

    public static void main(String[] args) {
        Digits digits = new Digits();

        digits.addDigitsToList("Az 1953. év 11. havának 25. napján a londoni Wembley Stadionban igen emlékezetes bőrbogyós játékban 6-0 eredménnyel Magyarország nyert... egy hazautat is.");
        System.out.println(digits.getNumbers());

    }
}
