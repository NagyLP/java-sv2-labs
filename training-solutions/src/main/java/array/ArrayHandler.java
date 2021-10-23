package array;

public class ArrayHandler {
    public void addIndexToNumber(int[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] += i;
        }
    }
    public void concatenateIndexToWord(String[] source) {
            for (int i = 0; i < source.length; i++) {
                source[i] = i + ". " +source[i];
            }
        }

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();
            int[] integerNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            String[] word = new String[7];

        arrayHandler.addIndexToNumber(integerNumber);

        for (int item:integerNumber) {
            System.out.println(item);
        }
        System.out.println();

        for (int item:integerNumber) {
            System.out.print(item+", ");
        }
    }
    }
