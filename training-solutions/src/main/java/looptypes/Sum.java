package looptypes;

public class Sum {
    public void printSums(int[] numbers) {
        for (int i = 0; i<numbers.length-1; i++) {
            int reply = numbers[i] + numbers[i+1];
            System.out.print(reply + " ");
        }
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sum.printSums(numbers);
    }
}
