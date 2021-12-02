package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeightTest {

    @Test
    void testCountChildrenWithHeightGreaterThan() {
        assertEquals(5, new Height().countChildrenWithHeightGreaterThan
                (Arrays.asList(155, 178, 160, 140, 150, 160, 180), 160));
    }
}