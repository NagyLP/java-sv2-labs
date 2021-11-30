package algorithmssum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {

    Salesperson salesperson = new Salesperson("Béláim", 1980);
    Salesperson salespersonTwo = null;

    @Test
    void testCreateSalesPerson() {

        assertEquals("Béláim", salesperson.getName());
        assertEquals(1980, salesperson.getRevenue());
    }

    @Test
    void testObject() {
        assertNotNull(salesperson);
        assertNull(salespersonTwo);
        assertNotSame(salesperson, salespersonTwo);

        salespersonTwo = salesperson;
        assertSame(salesperson, salespersonTwo);
    }
}
