package searching;

import java.util.Arrays;

public class Mountain {

    private final int[] peakHeights;

    public Mountain(int[] peakHeights) {
        this.peakHeights = peakHeights;
    }

    public int[] getPeakHeights() {
        return peakHeights;
    }

    public boolean searchPike(Peak peak) {
        return Arrays.binarySearch(peakHeights, peak.getHeight()) >= 0;
    }
}
