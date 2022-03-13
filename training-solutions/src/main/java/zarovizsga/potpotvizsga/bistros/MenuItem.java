package zarovizsga.potpotvizsga.bistros;

public class MenuItem {

    private final String name;
    private final int price;
    private final MenuItemType type;

    public MenuItem(String name, int price, MenuItemType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price * (type.getTax() / 100.0 + 1);
    }

    public MenuItemType getType() {
        return type;
    }
}
