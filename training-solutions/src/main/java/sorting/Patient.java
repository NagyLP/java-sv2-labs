package sorting;

import java.time.LocalDateTime;

public class Patient {

    private final String name;
    private final String ssn;
    private final LocalDateTime time;


    public Patient(String name, String ssn, LocalDateTime time) {
        this.name = name;
        this.ssn = ssn;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
