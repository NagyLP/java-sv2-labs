package sorting.webshop;

import java.time.LocalDateTime;

public class Product {

    private final String name;
    private final double price;
    private final LocalDateTime date;


    public Product(String name, double price, LocalDateTime date) {
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
