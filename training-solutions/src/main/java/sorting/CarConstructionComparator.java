package sorting;

import java.util.Comparator;

public class CarConstructionComparator implements Comparator<Car> {

    @Override
    public int compare(Car one, Car other) {
        return Integer.compare(one.getYearOfConstruction(), other.getYearOfConstruction());
    }
}
