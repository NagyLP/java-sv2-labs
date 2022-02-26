package A_Training.Kennel;

public class Beagle extends Dog {

    private static final int BEEAGLE_FEED_HAPPINESS = 2;
    private static final int BEAGLE_PLAY_HAPPINESS = 2;

    public Beagle(String name) {
        super(name);
    }

    @Override
    public void feed() {
        increasedHappiness(BEEAGLE_FEED_HAPPINESS);
    }

    @Override
    public void play(int hours) {
        increasedHappiness(hours * BEAGLE_PLAY_HAPPINESS);
    }
}
