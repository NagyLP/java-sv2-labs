package chars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Whitespace {
    public void makeWhitespaceToStar(String text) {
        char[] toStarList = text.toCharArray();
        for (char i = 0; i< toStarList.length; i++) {
            if (toStarList[i] == ' ') {
            toStarList[i] = '*';
            }
            }
        String output = new String(toStarList);
        System.out.println(toStarList);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Whitespace whitespace = new Whitespace();

        System.out.println("Kérem a csillagozni kívánt szót: ");
        whitespace.makeWhitespaceToStar(sc.nextLine());
    }
    }
