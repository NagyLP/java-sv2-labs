package methodstructure.pendrives;

public class Pendrive {

    private final String name;
    private final int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public int comparePricePerCapacity(Pendrive other) {
        if (this.getPricePerCapacity() > other.getPricePerCapacity())
            return 1;
        if (this.getPricePerCapacity() < other.getPricePerCapacity())
            return -1;
        return 0;
    }

    public boolean isCheaperThan(Pendrive other) {
        return this.price < other.price;
    }

    @Override
    public String toString() {
        return String.format("Pendrive datas:\n" +
                "- Name: %s\n" +
                "- Capacity: %d\n" +
                "- Price: %d", name, capacity, price);
    }

    public void risePrice(int percent) {
        price *= (1 + percent / 100.0);
    }

    public double getPricePerCapacity() {
        return price / capacity;
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
