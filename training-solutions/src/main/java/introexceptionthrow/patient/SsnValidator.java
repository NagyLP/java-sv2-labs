package introexceptionthrow.patient;

public class SsnValidator {

    public boolean isValidSsn(String ssn) {

        if (ssn.length() != 9) {
            return false;
        }
        try {

            int akk = 0;
            for (int i = 0; i < ssn.length(); i += 2) {
                akk += ssn.charAt(i) * 3;
            }
            for (int i = 1; i < ssn.length(); i += 2) {
                akk += ssn.charAt(i) * 7;
            }
            return (ssn.charAt(8) == (akk % 10));

        } catch (IllegalArgumentException iae) {
            return false;
        }
    }

/*    private int getAnIntFromChar(char aChar) {
        if (aChar < '0' || aChar > '9')
            throw new IllegalArgumentException("Not only numbers included.");
        return aChar - '0';
    }*/
}