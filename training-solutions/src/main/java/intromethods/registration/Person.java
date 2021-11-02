package intromethods.registration;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Person {

    private final String name;
    private final LocalDate dateOfBirth;
    String email;

    public Person(String name, LocalDate dateOfBirth, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Regisztrált szerzet: \n" +
                "Név: " + name + '\n' +
                "Szül. idő: " + dateOfBirth + "\n"+
                "Email= " + email;}

    public String getName() {
        return name;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public String getEmail() {
        return email;
    }
}
