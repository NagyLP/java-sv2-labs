package algorithmssum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoDigitEvensTest {

    TwoDigitEvens twoDigitEvens = new TwoDigitEvens();

    @Test
    void testGetSum() {
        assertEquals(1980, twoDigitEvens.getSum());
    }
}