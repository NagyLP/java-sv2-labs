package kepesitovizsga.addigits;

public class AddDigits {


    public int addDigits(String input) {
        if (input == null || input.isBlank() || input.isEmpty()) {
            return -1;
        }

        int sum = 0;
        for (char inputChar : input.toCharArray()) {
            if (Character.isDigit(inputChar)) {
                sum += Character.getNumericValue(inputChar);
            }
        }
        return sum;
    }
}
