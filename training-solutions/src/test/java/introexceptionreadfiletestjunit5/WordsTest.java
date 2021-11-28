package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WordsTest {

    @Test
    public void testFirstWordWithA() {
        String namesTest = new Words().getFirstWordWithA(Paths.get("src/test/resources/words.txt"));
        assertEquals("Anna", namesTest);
    }

    @Test
    public void testFirstWordWithA_NoWithA() {
        String namesTest = new Words().getFirstWordWithA(Paths.get("src/test/resources/wordsAnother.txt"));
        assertEquals("A", namesTest);
    }

    @Test
    public void testFirstWordWithA_NoExistingFile() {
        Path path = Paths.get("...");

        assertEquals("Can not find the file.",
                assertThrows(IllegalStateException.class,
                        () -> new Words().getFirstWordWithA(path)).getMessage());
    }
}
