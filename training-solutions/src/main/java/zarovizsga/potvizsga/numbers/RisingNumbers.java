package zarovizsga.potvizsga.numbers;

import java.util.List;

public class RisingNumbers {

    public int getNumberOfSixDigitRisingNumbers(List<Integer> numbers) {
        validateListIsBlank(numbers);
        validateNumber
    }

    private void validateListIsBlank(List<Integer> numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("There are no numbers!");
        }
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("There are no numbers!");
        }
    }
}
