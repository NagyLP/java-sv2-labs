package introconstructors;

import java.time.LocalDateTime;

public class Task {

    private final String title;
    private final String description;
    private LocalDateTime startDateTime;
    private int duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void start () {this.startDateTime = LocalDateTime.now();}

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }
    public int getDuration() {
        return duration;
    }
}
