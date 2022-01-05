package interfacedefaultmethods.cloth;

public class TableCloth implements Square {

    private final double side;

    public TableCloth(double side) {
        this.side = side;
    }

    @Override
    public double getSide() {
        return side;
    }
}
