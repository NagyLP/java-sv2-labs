package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureTest {

    @Test
    void testGetMin() {
        List<Integer> temps = Arrays.asList(0, 1, -1, 2, 3, 6, 15, 17, 26, 10);

        assertEquals(-1, new Temperature().getMin(temps));
    }
}
