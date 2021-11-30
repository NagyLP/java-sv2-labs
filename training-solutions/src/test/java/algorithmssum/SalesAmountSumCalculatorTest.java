package algorithmssum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalesAmountSumCalculatorTest {

    SalesAmountSumCalculator SASC_Test = new SalesAmountSumCalculator();
    SalesAmountSumCalculator SASC_TestNull = null;

    @Test
    void testSumSalesRevenue() {
        List<Salesperson> salespersonList = new ArrayList<>(Arrays.asList(
                new Salesperson("Irma", 1000),
                new Salesperson("Gerzson", 1000),
                new Salesperson("Tarzan", 1000),
                new Salesperson("Jakab", 1000),
                new Salesperson("Gizi", 1000)
        ));

        assertEquals(5000, SASC_Test.sumRevenue(salespersonList));
    }
}
