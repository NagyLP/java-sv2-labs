package training;

public class GasStation {

    private int price;

    public GasStation(int price) {
        this.price = price;
    }

    public int tank (Car carName, int liter) {
        carName.setLiter(liter);
        return price * liter;
    }
}
