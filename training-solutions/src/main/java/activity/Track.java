package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {

    List<TrackPoint> trackPoint = new ArrayList<>();

    public Track() {
        this.trackPoint = trackPoint;
    }

    public Track(List<TrackPoint> trackPoint) {
        this.trackPoint = trackPoint;
    }

    public List<TrackPoint> getTrackPoint() {
        return trackPoint;
    }

    public void addTrackPoint(TrackPoint trackPoint) {
        this.trackPoint.add(trackPoint);
    }

    public double getFullElevation() {
        double elevationTotal = 0;
        for (int i = 0; i < trackPoint.size() - 1; i++) {
            elevationTotal += Math.max(0,
                    trackPoint.get(i + 1).getElevation() - trackPoint.get(i).getElevation());
        }
        return elevationTotal;
    }

    public double getFullDecrease() {
        double decreaseTotal = 0;
        for (int i = 0; i < trackPoint.size() - 1; i++) {
            decreaseTotal += Math.max(0,
                    trackPoint.get(i).getElevation() - trackPoint.get(i + 1).getElevation());
        }
        return decreaseTotal;
    }

    public double getDistance() {
        double distance = 0;
        for (int i = 0; i < trackPoint.size() - 1; i++) {
            distance += trackPoint.get(i).getDistanceFrom(trackPoint.get(i + 1));
        }
        return distance;
    }

    public Coordinate findMinimumCoordinate() {
        double latitudeMin = 0;
        double longitudeMin = 0;
        for (TrackPoint item : trackPoint) {
            latitudeMin = Math.min(latitudeMin, item.getCoordinate().getLatitude());
            longitudeMin = Math.min(longitudeMin, item.getCoordinate().getLongitude());
//            latitudeMin = latitudeMin > item.getCoordinate().getLatitude() ? item.getCoordinate().getLatitude() : latitudeMin;
//            longitudeMin = longitudeMin > item.getCoordinate().getLongitude() ? item.getCoordinate().getLongitude() : longitudeMin;
        }
        return new Coordinate(latitudeMin, longitudeMin);
    }

    public Coordinate findMaximumCoordinate() {
        double latitudeMax = 0;
        double longitudeMax = 0;
        for (TrackPoint item : trackPoint) {
            latitudeMax = Math.max(latitudeMax, item.getCoordinate().getLatitude());
            longitudeMax = Math.max(longitudeMax, item.getCoordinate().getLongitude());
//                        latitudeMax = latitudeMax < item.getCoordinate().getLatitude() ? item.getCoordinate().getLatitude() : latitudeMax;
//                        longitudeMax = longitudeMax < item.getCoordinate().getLongitude() ? item.getCoordinate().getLongitude() : longitudeMax;
        }
        return new Coordinate(latitudeMax, longitudeMax);
    }

//    public double getRectangleArea() {
//        return 0;
//    }
}
