package literals;

import java.util.Locale;

public class LiteralsMain {

    public static void main(String[] args) {

        System.out.println("1"+"2");
        System.out.println(1 + "" +2);

        double quotient = 3/4.0;
        System.out.println(quotient);

//        double quotient = 2/4d;

        long big = 3_244_444_444L;
        System.out.println(big);

        String word = "title".toUpperCase(Locale.ROOT);
        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));

//        System.out.println(Integer.toBinaryString(-100000000));



    }
}
