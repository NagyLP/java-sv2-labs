package zarovizsga.potpotvizsga.numbers;

import java.util.HashSet;
import java.util.List;

public class RisingNumbers {

    public int getNumberOfSixDigitRisingNumbers(List<Integer> numbers) {
        validateListIsBlank(numbers);
        return 0;
    }

    // JCF -Keretrendszer- Kollekciók

    private void validateDigitsIsDifferent(List<Integer> digits) {
        if (digits.size() != new HashSet<>(digits).size())
            throw new IllegalArgumentException("Digits is not different!");
    }

    // HIBAÜZENET KISZERVEZÉSE (String switch-be?)

    private void validateNumbersIsSixDigits(int number) {
        if (number < 100_000 || number > 999_999)
            throw new IllegalArgumentException("There are not six digits!");
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
