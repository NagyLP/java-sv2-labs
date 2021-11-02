package introconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CyclingTour {

    private final String description;
    private final LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public void registerPerson(int person) { numberOfPeople = numberOfPeople+person;}

    public void ride(double km) {kms = kms + km;}

    public String getDescription() {
        return description;
    }
    public LocalDate getStartTime() {
        return startTime;
    }
    public int getNumberOfPeople() {
        return numberOfPeople;
    }
    public double getKms() {
        return kms;
    }

    public static void main(String[] args) {
        CyclingTour cyclingTour = new CyclingTour("Tour de Francia" ,(LocalDate.now()));
        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());

        cyclingTour.registerPerson(1);
        cyclingTour.registerPerson(2);
        cyclingTour.registerPerson(4);

        cyclingTour.ride(20);
        cyclingTour.ride(25);
        cyclingTour.ride(55);

        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());
    }
}
