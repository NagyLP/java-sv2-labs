package algorithmsmax.sales;

import java.util.List;

public class Sales {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {
        Salesperson number = sales.get(0);
        for (Salesperson item : sales) {
            if (item.getAmount() > number.getAmount()) {
                number = item;
            }
        }
        return number;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {
        Salesperson number = sales.get(0);
        for (Salesperson item : sales) {
            if (item.getDifferenceFromTarget() > number.getDifferenceFromTarget()) {
                number = item;
            }
        }
        return number;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        Salesperson number = sales.get(0);
        for (Salesperson item : sales) {
            if (item.getDifferenceFromTarget() < number.getDifferenceFromTarget()) {
                number = item;
            }
        }
        return number;
    }
}
