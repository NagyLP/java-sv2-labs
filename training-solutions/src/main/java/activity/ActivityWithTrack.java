package activity;

public class ActivityWithTrack implements Activity {

    private final ActivityType type;
    private final Track track;

    public ActivityWithTrack(Track track, ActivityType type) {
        this.track = track;
        this.type = type;
    }

    @Override
    public double getDistance() {
        return track.getDistance();
    }

    @Override
    public ActivityType getType() {
        return type;
    }
}
