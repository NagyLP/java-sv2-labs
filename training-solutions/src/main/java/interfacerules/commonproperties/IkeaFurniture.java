package interfacerules.commonproperties;

public class IkeaFurniture implements Name, Length, Width {

    private final String name;
    private final double length;
    private final double width;

    public IkeaFurniture(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
