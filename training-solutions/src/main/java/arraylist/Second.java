package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Second {
    public static void main(String[] args) {

        List<String> numbers = new ArrayList<>();

        numbers.add("3");
        numbers.add("9");
        numbers.add("42");
        numbers.add("67");
        numbers.add("4");
        numbers.add("0");
        numbers.add("76");
        numbers.add("14");
        numbers.add("84");
        numbers.add("35");
        numbers.add("92");

        for (int i=1; i<numbers.size(); i=i+2) {
            System.out.println(numbers.get(i));
        }
    }
}
