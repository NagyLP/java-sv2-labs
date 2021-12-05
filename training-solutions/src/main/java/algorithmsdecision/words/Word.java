package algorithmsdecision.words;

import java.util.List;

public class Word {

    public boolean containsLongerWord(List<String> listWord, String word) {
        for (String item : listWord) {
            if (word.length() == item.length())
                return true;
        }
        return false;
    }
}
