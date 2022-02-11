package activity;

public class ActivityWithoutTrack implements Activity {

    private final ActivityType type;

    public ActivityWithoutTrack(ActivityType type) {
        this.type = type;
    }

    public double getDistance() {
        return 0;
    }

    @Override
    public ActivityType getType() {
        return type;
    }
}
