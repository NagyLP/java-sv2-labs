package stringscanner;

import java.util.Scanner;

public class IntScanner {

    public String convertInts(String ints) {
        Scanner sc = new Scanner(ints).useDelimiter(";");
        StringBuilder sb = new StringBuilder();

        while (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number > 100) {
                sb.append(number);
                sb.append(", ");
            }
        }
        String reply = sb.toString();
        if (reply.length() == 0) {
            return reply;
        }
        return reply.substring(0, reply.length() - 1);
    }

    public static void main(String[] args) {
        IntScanner is = new IntScanner();

        System.out.println(is.convertInts("5;3;107;12;123;18;198"));
    }
}
