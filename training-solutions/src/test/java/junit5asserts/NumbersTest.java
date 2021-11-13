package junit5asserts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumbersTest {

    @Test
    void testGetEvenNumbers() {
        Numbers numbers = new Numbers();
        int[] number = new int[]{2, 8, 5, 6, 2, 3, 9};
        int[] replyNumber = new int[]{2, 8, 0, 6, 2, 0, 0};

        assertArrayEquals(replyNumber, numbers.getEvenNumbers(number));

    }
}
