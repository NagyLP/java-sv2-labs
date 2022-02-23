package activitytracker;

import activity.TrackPoint;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Activity {

    private long id;
    private final LocalDateTime startTime;
    private final String description;
    private final ActivityType type;
    private List<TrackPoint> trackPoints;

    public Activity(LocalDateTime startTime, String description, ActivityType type) {
        this.startTime = startTime;
        this.description = description;
        this.type = type;
    }

    public Activity(long id, LocalDateTime startTime, String description, ActivityType type) {
        this(startTime, description, type);
        this.id = id;
    }

    public Activity(LocalDateTime startTime, String description, ActivityType type, List<TrackPoint> trackPoints) {
        this(startTime, description, type);
        this.trackPoints = trackPoints;
    }


    public Activity(long id, LocalDateTime startTime, String description, ActivityType type, List<TrackPoint> trackpoints) {
        this(id, startTime, description, type);
        this.trackPoints = trackpoints;
    }


    public long getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDescription() {
        return description;
    }

    public ActivityType getType() {
        return type;
    }

    public List<activitytracker.TrackPoint> getTrackpoints() {
        return new ArrayList<>(trackPoints);
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", desc='" + description + '\'' +
                ", activityType=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return id == activity.id &&
                Objects.equals(startTime, activity.startTime) &&
                Objects.equals(description, activity.description) &&
                type == activity.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startTime, description, type);
    }
}
