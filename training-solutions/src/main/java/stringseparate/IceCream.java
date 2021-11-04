package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCream {

       public static void main(String[] args) {

//        List<String > names = new ArrayList<>(Arrays.asList("csoki, vanília, eper, citrom, puncs"));
        List<String > names = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        names.add("csoki");
        names.add("vanília");
        names.add("eper");
        names.add("citrom");
        names.add("puncs");

        for ( int i = 0; i < names.size(); i++) {
            if (i !=0) {
                    sb.append(", ");
            }
            sb.append(names.get(i));
        }
        System.out.println("Ma kapható: " +sb+ ". Gyerekeknek féláron!");
       }

//    boolean first = true;
//        for (String name: names) {
//        if (first) {
//            first = false;
//        } else {
//            sb.append(", ");
//        }
//        sb.append(name);
//    }


}
