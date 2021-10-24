package math.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {

        List<String> lucky = new ArrayList<>();

        lucky.add("1. Szeg János");
        lucky.add("2. Piri Piros");
        lucky.add("3. Kék Jónás");
        lucky.add("4. Para Zita");
        lucky.add("5. Cserepes Virág");
        lucky.add("6. Dzsingisz kán Béla");
        lucky.add("7. Jancsó Miklós");
        lucky.add("8. Albert Einstein");
        lucky.add("9. Herbert Zweiholtz");
        lucky.add("10. Menő Mária");

        Random random = new Random();
        int oneAndTwo = random.nextInt(5);
        int sixAndTen = random.nextInt(5) + 5;

        System.out.println(lucky.get(oneAndTwo));
        System.out.println(lucky.get(sixAndTen));
    }
}
