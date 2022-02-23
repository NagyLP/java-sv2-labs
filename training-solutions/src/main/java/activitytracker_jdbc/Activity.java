package activitytracker_jdbc;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Activity {

    private final long id;
    private final LocalDateTime startTime;
    private final String description;
    private final ActivityType type;
    private List<TrackPoint> trackPoints;

    public Activity(long id, LocalDateTime startTime, String description, ActivityType type, List<TrackPoint> trackPoints) {
        this.id = id;
        this.startTime = startTime;
        this.description = description;
        this.type = type;
        this.trackPoints = trackPoints;
    }

    public Activity(LocalDateTime startTime, String description, ActivityType type, List<TrackPoint> trackPoints) {
        this(0, startTime, description, type);
        this.trackPoints = trackPoints;
    }

    public Activity(LocalDateTime startTime, String description, ActivityType type) {
        this(0, startTime, description, type, List.of());
    }


    public Activity(long id, LocalDateTime startTime, String description, ActivityType type) {
        this(id, startTime, description, type, List.of());
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

    public List<TrackPoint> getTrackpoints() {
        return trackPoints;
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
        activitytracker_jdbc.Activity activity = (activitytracker_jdbc.Activity) o;
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

