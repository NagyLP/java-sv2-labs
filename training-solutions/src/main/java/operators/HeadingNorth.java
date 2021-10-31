package operators;

public class HeadingNorth {

    public int getNumberOfNewDirections() {
        int directionSum = 0;
        int direction = 0;
        for (int i = 10; direction<360; i+=10) {
            direction+=i;
            directionSum++;
        }
        return directionSum;
    }

    public static void main(String[] args) {
        HeadingNorth headingNorth = new HeadingNorth();
        System.out.println("Ennyiszer fordul \"Béjla\": " +headingNorth.getNumberOfNewDirections());
    }
}
