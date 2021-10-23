package array;

public class ArrayMain {
    public static void main(String[] args) {
        int[] a = {2, 3, 4};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int item : a) {
            System.out.println(item);
        }
        String[] fruits = {"apple", "peach", "plum", "orange"};
        String[] favoriteFruits = new String[2];
        System.arraycopy(fruits, 1, favoriteFruits, 0, 2);
        for (String item : fruits) {
            System.out.println(item);
        }
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i] + "\n");
        }
        for (String item : favoriteFruits) {
            System.out.println(item + "\n");
        }
        for (int i = 0; i < favoriteFruits.length; i++) {
            System.out.println(favoriteFruits[i]);
        }

        /*FELADAT - Tömbök kezelése*/
        System.out.println("TÖMBÖK KEZELÉSE \n");
        String[] week = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        System.out.println("Második elem v. komponens?: " + week[1] + "\n" + "Tömb hossza: " + week.length);

        int[] numbers = new int[5];
        numbers[0] = 1;
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] * 2;
            System.out.print(numbers[i] + " ");
        }

    System.out.println();

        for (int item : numbers) {
            System.out.print(item + "  ");
        }

    System.out.println();

        boolean[] bool0 = new boolean[6];
        for (int i = 1; i < bool0.length; i++) {
            bool0[i] = !bool0[i - 1];
            System.out.print(bool0[i] +" ");
        }

        System.out.println();

        for (int i = 0; i < bool0.length; i++) {
            System.out.print(bool0[i] + " ");
        }
    }
}
