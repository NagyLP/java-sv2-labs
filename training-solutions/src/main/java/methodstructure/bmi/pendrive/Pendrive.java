package methodstructure.bmi.pendrive;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public String toString() {
        return String.format("Pendrive datas:\n" +
                "- Name: %s\n" +
                "- Capacity: %d\n" +
                "- Price: %d", name, capacity, price);
    }

    public void risePrice(int percent) {
        price *= (1 + percent / 100);
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }
}
