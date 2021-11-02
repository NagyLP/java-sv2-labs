package arrayofarrays;

import array.ArrayHandler;

public class ArrayOfArrays {

    public void printArrayOfArrays(int[][] a) {
        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j+" ");
            }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();
        int[][] testArray = {{0, 1, 2}, {30, 41, 52}, {60, 71, 82}, {90, 11, 12}};

        arrayOfArrays.printArrayOfArrays(testArray);
    }
}
