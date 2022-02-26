package A_Training.Kennel;

public class Husky extends Dog {

    private static final int HUSKY_FEED_HAPPINESS = 4;
    private static final int HUSKY_PLAY_HAPPINESS = 3;

    public Husky(String name) {
        super(name);
    }

    @Override
    public void feed() {
        increasedHappiness(HUSKY_FEED_HAPPINESS);
    }

    @Override
    public void play(int hours) {
        increasedHappiness(hours * HUSKY_PLAY_HAPPINESS);
    }
}
