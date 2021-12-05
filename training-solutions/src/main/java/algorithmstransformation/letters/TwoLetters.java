package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {

    public List<String> getFirstTwoLetters(List<String> wordsList) {
        List<String> twoLettersList = new ArrayList<>();
        for (String item : wordsList) {
            twoLettersList.add(item.substring(0, 2));
        }
        return twoLettersList;
    }
}
