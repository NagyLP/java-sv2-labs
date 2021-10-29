package chars;

import java.util.Scanner;

public class Words {

    public void pushWorld(String word) {
        char[] charsBlock = word.toCharArray();
        for (int i = 0; i < charsBlock.length; i++) {
            charsBlock[i] += 1;
        }
        String pWOut = new String(charsBlock);
        System.out.println(pWOut);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Words words = new Words();

        System.out.println("Kérem a szót: ");
        words.pushWorld(sc.nextLine());

    }
}
