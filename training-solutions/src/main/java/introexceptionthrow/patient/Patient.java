package introexceptionthrow.patient;

public class Patient {

    public static final int MIN_YEAR = 1900;

    String name;
    String socialSecurityNumber;
    int yearOfBirth;

    public Patient(String name, String ssn, int year) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Hibás névmegadás, a név nem lehet üres: " + "\"" + name + "\"");
        }
        if (year < MIN_YEAR) {
            throw new IllegalArgumentException("Születési év nem megfelelő, nem lehet 1900-nál korábbi: " + "\"" + year + "\"");
        }
        if (!new SsnValidator().isValidSsn(ssn)) {
            throw new IllegalArgumentException("Ez (" + ssn + ") a TAJ szám kamu. :-)");
        }
        this.name = name;
        this.socialSecurityNumber = ssn;
        this.yearOfBirth = year;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {

        Patient onePatient = new Patient("Gipsz Jakab", "12345678", 1950);

        System.out.println(onePatient.getName());
        System.out.println(onePatient.getSocialSecurityNumber());
        System.out.println(onePatient.getYearOfBirth() + "\n");

        Patient twoPatient = new Patient("   ", "87654321", 1950);

        System.out.println(onePatient.getName());
        System.out.println(onePatient.getSocialSecurityNumber());
        System.out.println(onePatient.getYearOfBirth() + "\n");

        Patient threePatient = new Patient("Gipsz Jakab", "12345678", 1899);

        System.out.println(onePatient.getName());
        System.out.println(onePatient.getSocialSecurityNumber());
        System.out.println(onePatient.getYearOfBirth() + "\n");
    }
}
