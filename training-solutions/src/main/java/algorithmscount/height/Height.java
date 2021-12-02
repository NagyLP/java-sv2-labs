package algorithmscount.height;

import java.util.List;

public class Height {

    public int countChildrenWithHeightGreaterThan(List<Integer> heightChild, int heightMax) {

        int childCounter = 0;
        for (Integer item : heightChild) {
            if (item <= heightMax) {
                childCounter++;
            }
        }
        return childCounter;
    }
}
