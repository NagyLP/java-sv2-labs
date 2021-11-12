package training;

public class Car {

    private double liter;
    private double distance;

     public double consumption() {
         return liter * 100.0 / distance;
    }

    public void setLiter(double liter) {
        this.liter = liter;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
