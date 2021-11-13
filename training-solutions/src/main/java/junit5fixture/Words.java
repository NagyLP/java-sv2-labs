package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {

    private List<String> words = new ArrayList<>();

    public void addWord(String word) {
        words.add(word);
    }

    public void getWordsStartWith(String prefix) {
        List<String> wordsToRemove = new ArrayList<>();
        for (String item : words) {
            if (!item.startsWith(prefix)) {
                wordsToRemove.add(item);
            }
        }
        words.removeAll(wordsToRemove);
    }

    public void getWordsWithLength(int length) {
        List<String> wordsToRemove = new ArrayList<>();
        for (String item : words) {
            if (item.length() != length) {
                wordsToRemove.add(item);
            }
        }
        words.removeAll(wordsToRemove);
    }

    public List<String> getWords() {
        return words;
    }
}
