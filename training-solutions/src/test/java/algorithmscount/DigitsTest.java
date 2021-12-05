package algorithmscount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitsTest {

    @Test
    void testGetNumbers() {
        Digits digits = new Digits();

        assertEquals(9, digits.getCountOfNumbers());
    }
}