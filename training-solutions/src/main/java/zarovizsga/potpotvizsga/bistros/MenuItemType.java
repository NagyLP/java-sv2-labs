package zarovizsga.potpotvizsga.bistros;

public enum MenuItemType {
    FOOD(20), DRINK(27);

    private final int tax;

    MenuItemType(int tax) {
        this.tax = tax;
    }

    public int getTax() {
        return tax;
    }
}
