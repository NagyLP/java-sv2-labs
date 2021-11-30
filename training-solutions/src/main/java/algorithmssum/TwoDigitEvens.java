package algorithmssum;

public class TwoDigitEvens {

    public int getSum() {
        int akkSum = 0;
        for (int i = 11; i <= 100; i += 2) {
            if (i % 5 != 0) {
                akkSum += i;
            }
        }
        return akkSum;
    }
}