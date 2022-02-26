package A_Training.Kennel;

public abstract class Dog {

    private final String name;
    private int happiness = 0;

    public Dog(String name) {
        this.name = name;
    }

    public abstract void feed();

    public abstract void play(int hours);

    protected void increasedHappiness(int happinessDiff) {
        happiness += happinessDiff;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }
}
