package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

    private String name;
    private final LocalDate dateOfBirth;
    private final LocalDateTime beginEmployment;

    public Employee (int year, int month, int day, String name) {
        this.dateOfBirth = LocalDate.of(year,month, day);
        this.name = name;
        this.beginEmployment = LocalDateTime.now();
    }

    public void setName(String name) {this.name = name;}

    public String getName() {return name;}
    public LocalDate getDateOfBirth() {return dateOfBirth;}
    public LocalDateTime getBeginEmployment() {return beginEmployment;}
}