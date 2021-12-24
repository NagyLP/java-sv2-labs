package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive getBest(List<Pendrive> comparePendrives) {
        Pendrive bestPricePerCapacity = comparePendrives.get(0);
        for (int i = 0; i < comparePendrives.size(); i++) {
            if (bestPricePerCapacity.comparePricePerCapacity(comparePendrives.get(i)) == 1) {
                bestPricePerCapacity = comparePendrives.get(i);
            }
        }
        return bestPricePerCapacity;
    }

    public Pendrive getCheapest(List<Pendrive> comparePendrives) {
        Pendrive cheapestPendrive = comparePendrives.get(0);
        for (int i = 0; i < comparePendrives.size(); i++) {
            if (cheapestPendrive.isCheaperThan(comparePendrives.get(i))) {
                cheapestPendrive = comparePendrives.get(i);
            }
        }
        return cheapestPendrive;
    }

    public void risePriceWhereCapacity(List<Pendrive> comparePendrives, int percent, int capacity) {
        for (Pendrive item : comparePendrives) {
            if (item.getCapacity() == capacity)
                item.risePrice(percent);
        }
    }
}
