package arrayofarrays;

public class DailyValues {

    public void getValues() {
        int[][] getValues = new int[12][];
        int[] monthEndDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i=0; i<monthEndDays.length; i++) {
            getValues[i] = new int[monthEndDays[i]];
        }
    printArrayOfArrays(getValues);
    }

    private void printArrayOfArrays(int[][] getValues) {
        for (int i[]:getValues) {
            for (int j : i) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DailyValues dailyValues = new DailyValues();
        dailyValues.getValues();
    }
}
