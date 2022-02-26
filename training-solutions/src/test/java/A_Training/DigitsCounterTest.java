package A_Training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DigitsCounterTest {

    @Test
    void getCountOfDigits() {
        DigitsCounter digitsCounter = new DigitsCounter();

        Exception exOne = assertThrows(IllegalArgumentException.class,
                () -> digitsCounter.getCountOfDigits(null));
        assertEquals("ERROR - Input is null: " + null, exOne.getMessage());

        Exception exTwoo = assertThrows(IllegalArgumentException.class,
                () -> digitsCounter.getCountOfDigits(""));
        assertEquals("ERROR - Input is null: " + "", exTwoo.getMessage());

        assertEquals(1, digitsCounter.getCountOfDigits("0"));
        assertEquals(4, digitsCounter.getCountOfDigits("445456465767777777"));
        assertEquals(4, digitsCounter.getCountOfDigits("54654dfgh4gf8h4er844"));
        assertEquals(2, digitsCounter.getCountOfDigits("55fd4g fg54 fd5hj 4ztruj5"));
    }
}
