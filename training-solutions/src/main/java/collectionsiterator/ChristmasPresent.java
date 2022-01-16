package collectionsiterator;

public class ChristmasPresent {

    private final String description;
    private final String nameOfPerson;
    private final int price;

    public ChristmasPresent(String description, String nameOfPerson, int price) {
        this.description = description;
        this.nameOfPerson = nameOfPerson;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public int getPrice() {
        return price;
    }
}
