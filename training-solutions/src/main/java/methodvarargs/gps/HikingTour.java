package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {

    private final List<FieldPoint> fieldPoints = new ArrayList<>();

    public List<FieldPoint> getFieldPoints() {
        return fieldPoints;
    }

    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsLog) {
        if (timeOfLogging == null) {
            throw new IllegalArgumentException("Time of logging must not be null!");
        }
        for (FieldPoint item : fieldPointsLog) {
            item.setTimeOfLogging(timeOfLogging);
            fieldPoints.add(item);
        }
    }
}
