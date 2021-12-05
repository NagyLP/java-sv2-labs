package algorithmsmax.hill;

import java.util.List;

public class Hill {

    public int getMax(List<Integer> hillsMaxHeight) {

        int heightsHill = hillsMaxHeight.get(0);

        for (int item : hillsMaxHeight) {
            if (item > heightsHill) {
                heightsHill = item;
            }
        }
        return heightsHill;
    }
}
