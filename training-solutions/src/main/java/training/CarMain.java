package training;

public class CarMain {

    public static void main(String[] args) {

        Car car = new Car();
        GasStation gasStation = new GasStation(500);
        System.out.println("Ár: " +gasStation.tank(car, 41));
        car.setDistance(948);
        System.out.println("Átlagfogyasztás: " +car.consumption());
    }
}
