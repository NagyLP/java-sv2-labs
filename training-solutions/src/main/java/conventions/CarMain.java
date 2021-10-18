package conventions;

public class CarMain {
    public static void main(String[] args) {

        Car carN = new Car("Nissan", "3.8 DOCH 24V", 2, 4);

        System.out.println("Típus: " + carN.getCarType());
        System.out.println("Motor: " + carN.getEngineType());
        System.out.println("Ajtók: " + carN.getDoors());
        System.out.println("Személyek: " + carN.getPersons());

        carN.addModelName("GT-R Nismo");

        carN.setCarType("Nissan");
        carN.setEngineType("1,6 160SR");
        carN.setDoors(4);
        carN.setPersonS(4);
        carN.addModelName("Ez a nem GT-R");

        System.out.println("Típus: " + carN.getCarType());
        System.out.println("Motor: " + carN.getEngineType());
        System.out.println("Ajtók: " + carN.getDoors());
        System.out.println("Személyek: " + carN.getPersons());
    }
}