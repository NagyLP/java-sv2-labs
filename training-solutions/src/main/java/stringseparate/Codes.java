package stringseparate;

import java.util.ArrayList;
import java.util.List;

public class Codes {
    StringBuilder sb = new StringBuilder();

    public String getCodesStart(List<String> codes) {
        boolean first = true;
        for (String item : codes) {
            if (Character.isAlphabetic(item.charAt(0)) && first) {
                sb.append(item);
                first = false;
            } else if (Character.isAlphabetic(item.charAt(0))) {
                sb.append(", ").append(item);
            }
        }
        return sb.toString();
    }

     public static void main(String[] args) {
        Codes codes = new Codes();

        List<String> codestable = new ArrayList<>();

        codestable.add("T57fbj");
        codestable.add("xtcu45");
        codestable.add("f578GVHd");
        codestable.add("15876");
        codestable.add("58793");

        System.out.println(codes.getCodesStart(codestable));
    }
}
