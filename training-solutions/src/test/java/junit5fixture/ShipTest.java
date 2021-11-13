package junit5fixture;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {

    public Ship ship;

    @BeforeEach
    void init() {
        ship = new Ship("San Felipe", 1765, 80.0);
    }

    @Test
void testName () {
        assertEquals("San Felipe", ship.getName());
        assertNotEquals("Szan Filip", ship.getName());
    }

    @Test
    void testYearOfConstruction() {
        assertEquals(1765, ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction() == 1765);
        assertFalse(ship.getYearOfConstruction() == 2000);
        assertEquals(true, ship.getYearOfConstruction() == 1765);
        assertEquals(false, ship.getYearOfConstruction() == 2000);
    }

    @Test
    void testLength() {
        assertEquals(80.0, ship.getLength(), 0.005);
    }

    @Test
    void testNull() {
        Ship anotherShip = null;

        assertNotNull(ship);
        assertNull(anotherShip);
    }

    @Test
    void testSameObjects() {
        Ship anotherShip = ship;

        assertSame(ship, anotherShip);
    }

    @Test
    void testNotSameObjects() {
        Ship anotherShip = new Ship("San Felipe", 1765, 80.0);

        assertNotSame(ship, anotherShip);
    }
}
