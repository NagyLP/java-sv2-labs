package primitivetypes.exam;

import java.time.LocalDate;

public class Person {

    private final String name;
    private final LocalDate birthDate;
    private final int postNumber;
    private final double average;

    public Person(String name, LocalDate birthDate, int postNumber, double average) {
        this.name = name;
        this.birthDate = birthDate;
        this.postNumber = postNumber;
        this.average = average;
    }

    @Override
    public String toString() {
        return "- Szem éj - " +
                "Név: '" + name + '\'' + "\n"+
                "Születésnap: " + birthDate + "\n"+
                "Irányítószám: " + postNumber + "\n"+
                "Átlag: " + average + "\n";
    }

    public String getName() {
        return name;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public int getPostNumber() {
        return postNumber;
    }
    public double getAverage() {
        return average;
    }
}
