package A_Training;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);

        String regex = "(\\s|^)([a-z]+)(\\s+\\2)+(?=(?:\\s|$))";
        Pattern pattern = Pattern.compile(
                regex, Pattern.CASE_INSENSITIVE);
        String numSentences = scanIn.nextLine();

        while (!numSentences.isEmpty()) {
            String input = scanIn.nextLine();
            Matcher match = pattern.matcher(input);
            boolean findMatch = true;

            while (match.find()) {
                input = match.replaceAll("$1");
                findMatch = false;
            }
            System.out.println(input);
        }
        scanIn.close();
    }
}

