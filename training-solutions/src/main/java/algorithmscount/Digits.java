package algorithmscount;

public class Digits {

    public int getCountOfNumbers() {

        int countSolution = 0;

        for (int i = 11; i < 100; i++) {
            if (getTwoDigitsDifference(i))
                countSolution++;
        }
        return countSolution;
    }

    public boolean getTwoDigitsDifference(int number) {
        return Math.abs((number / 10) - (number % 10)) == 5;
    }
}
