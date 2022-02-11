package activity;

//import localvariables.Distance;

public final class Report {

    private final ActivityType activityType;
    private final double distance;


    public ActivityType getActivityType() {
        return activityType;
    }

    public double getDistance() {
        return distance;
    }

    public Report(ActivityType activityType, double distance) {
        this.activityType = activityType;
        this.distance = distance;
    }
}
