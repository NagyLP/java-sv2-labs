package dynamictypes.publictransport;

public class Metro extends PublicVehicle {

    private final int numberOfStations;

    public Metro(int lineNumber, double length, int numberOfStations) {
        super(lineNumber, length);
        this.numberOfStations = numberOfStations;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }
}
