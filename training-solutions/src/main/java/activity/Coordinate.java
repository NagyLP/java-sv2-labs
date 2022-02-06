package activity;

public class Coordinate {

    private final double latitude;
    private final double longitude;

    public Coordinate(double latitude, double longitude) {
        switch (validatorCorrdinates(latitude, longitude)) {
            case 1 -> throw new IllegalArgumentException("Fatal-Total-All ERROR - data: " + latitude + longitude + "\n Na persze...");
            case 2 -> throw new IllegalArgumentException("Syntax- ERROR -data: " + latitude + "\n(Latitude value [-90, 90])");
            case 3 -> throw new IllegalArgumentException("Syntax- ERROR -data: " + longitude + "\n(Longitude value [-180, 180])");
            default -> {
                this.latitude = latitude;
                this.longitude = longitude;
            }
        }
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    private int validatorCorrdinates(double latitude, double longitude) {
        if (latitude > 90 | latitude < -90 && longitude > 180 | longitude < -180) {
            return 1;
        }
        if (latitude > 90 | latitude < -90) {
            return 2;
        }
        if (longitude > 180 | longitude < -180) {
            return 3;
        }
        return 0;
    }
}
