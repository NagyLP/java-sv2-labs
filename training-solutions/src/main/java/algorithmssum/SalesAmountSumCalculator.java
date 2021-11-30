package algorithmssum;

import java.util.List;

public class SalesAmountSumCalculator {

    public int sumRevenue(List<Salesperson> revenue) {
        int akkSum = 0;
        for (Salesperson item : revenue) {
            akkSum += item.getRevenue();
        }
        return akkSum;
    }
}
