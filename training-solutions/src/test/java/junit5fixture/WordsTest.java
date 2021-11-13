package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {

    Words words;

    @BeforeEach
    void init() {
        words = new Words();
        words.addWord("egy");
        words.addWord("kettő");
        words.addWord("három");
        words.addWord("négy");
        words.addWord("öt");
        words.addWord("hat");
    }

    @Test
    void testGetWordsStartWith() {
        List<String> reply = Arrays.asList("három", "hat");
        words.getWordsStartWith("h");

        assertEquals(reply, words.getWords());
    }

    @Test
    void testGetWordsWithLength() {
        List<String> reply = Arrays.asList("kettő", "három");
        words.getWordsWithLength(5);

        assertEquals(reply, words.getWords());
    }
}
