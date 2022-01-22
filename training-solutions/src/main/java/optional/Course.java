package optional;

public class Course {

    private final String name;

    private final Level level;

    private final int price;

    public Course(String name, Level level, int price) {
        this.name = name;
        this.level = level;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Level getLevel() {
        return level;
    }

    public int getPrice() {
        return price;
    }
}
