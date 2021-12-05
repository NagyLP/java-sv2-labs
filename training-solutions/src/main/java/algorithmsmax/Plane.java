package algorithmsmax;

public class Plane {

    public int getLongestOcean(String map) {

        int longestNulls = 0;
        int currentNulls = 0;

        for (char item : map.toCharArray()) {
            if (item == 0) {
                currentNulls++;
                if (currentNulls > longestNulls)
                    longestNulls = currentNulls;
            } else {
                currentNulls = 0;
            }
        }
        return longestNulls;
    }
}
