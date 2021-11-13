package junit5asserts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {

    @Test
    void testName() {
        Dragon dragon = new Dragon("Süsü", 1, 10.1);

        assertEquals("Süsü", dragon.getName());
        assertNotEquals("Deltoid", dragon.getName());
    }

    @Test
    void testNumberOfHeads() {
        Dragon dragon = new Dragon("Süsü", 1, 10.1);

        assertEquals(1, dragon.getNumberOfHeads());
        assertEquals(true, dragon.getNumberOfHeads() == 1);
        assertEquals(false, dragon.getNumberOfHeads() == 7);
        assertTrue(dragon.getNumberOfHeads() == 1);
        assertFalse(dragon.getNumberOfHeads() == 7);
    }

    @Test
    void testHeight() {
        Dragon dragon = new Dragon("Süsü", 1, 10.1);
        assertEquals(5.3, dragon.getHeight(), 0.005);
    }

    @Test
    void testNull() {
        Dragon dragon = new Dragon("Süsü", 1, 10.1);
        Dragon anotherDragon = null;

        assertNotNull(dragon);
        assertNull(anotherDragon);
    }

    @Test
    void testSameObjects() {
        Dragon dragon = new Dragon("Süsü", 1, 10.1);
        Dragon anotherDragon = dragon;

        assertSame(dragon, anotherDragon);
    }

    @Test
    void testNotSameObjects() {
        Dragon dragon = new Dragon("Süsü", 1, 10.1);
        Dragon anotherDragon = new Dragon("Süsü", 1, 10.1);

        assertNotSame(dragon, anotherDragon);
    }
}
