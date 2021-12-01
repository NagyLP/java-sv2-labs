package algorithmsmax.temperature;

import java.util.List;

public class Temperature {

    public int getMin(List<Integer> temperatures) {
        int minTemp = temperatures.get(0);
        for (int item : temperatures) {
            if (item < minTemp) {
                minTemp = item;
            }
        }
        return minTemp;
    }
}
