package recursion;

import org.junit.jupiter.api.Test;

class VowelsTest {

    @Test
    void testIsPalindrome() {
        Vowels vowels = new Vowels();

        assertEquals(0, vowels.getNumberOfVowels(""));
        assertEquals(1, vowels.getNumberOfVowels("a"));
        assertEquals(0, vowels.getNumberOfVowels("b"));
        assertEquals(9, vowels.getNumberOfVowels("árvíztűrő tükörfúrógép"));
    }
}