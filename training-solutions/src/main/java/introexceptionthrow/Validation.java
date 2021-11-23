package introexceptionthrow;

public class Validation {

    public void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("A név üres.");
        }
    }

    public void validateAge(String ageString) {

        char[] ageStringChars = ageString.toCharArray();
        for (char item : ageStringChars) {
            if (!Character.isDigit(item)) {
                throw new IllegalArgumentException("Hibás a megadott kor formátuma.");
            }
        }
        if (ageString.isBlank() || Integer.parseInt(ageString) <= 0 || 120 < Integer.parseInt(ageString)) {
            throw new IllegalArgumentException("Hibás a megadott kor értéke.");
        }
    }

/*    public void validateAge(String ageString) {
        if (ageString.length() == 0) {
            throw new IllegalArgumentException("Age can not be empty!");
        }
        char[] chars = ageString.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Age is not a number!");
            }
        }
        int age = Integer.parseInt(ageString);
        if (age > 120) {
            throw new IllegalArgumentException("Not valid age!");
        }
    }*/

}
