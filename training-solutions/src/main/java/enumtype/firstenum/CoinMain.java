package enumtype.firstenum;

import java.util.Arrays;

import static enumtype.firstenum.Coin.HUNDRED;


public class CoinMain {
    public static void main(String[] args) {
        Coin coin_HNDR = HUNDRED;

        for (Coin item : Coin.values()) {
            System.out.println(item);
        }
        System.out.println(coin_HNDR.ordinal());
        System.out.println();
        System.out.println(coin_HNDR.name());

        System.out.println(coin_HNDR.toString(coin_HNDR.getValue()));

// ÖSSZES ELEM - TÖMB-ben
        Coin[] coins = Coin.values();
        System.out.println(coins.length);

        System.out.println(Arrays.toString(Coin.values()) + "\n");

        for (Coin coin : coins) {
            System.out.println(coin + ": " + coin.getValue());
        }
        System.out.println();
        for (int i = 0; i < coins.length; i++) {
            System.out.println(coins[i] + ": " + coins[i].getValue());
        }

// LEKÉRÉS: - KONSTANS NÉV alapján STRINGGEL - valueOf
        Coin c = Coin.valueOf("HUNDRED");
        System.out.print(Coin.valueOf("HUNDRED"));
        System.out.print(" ; " + c + " ; ");
        System.out.print(Coin.values()[1] + " ; ");
        System.out.print(coin_HNDR.name() + "\n");
// LEKÉRÉS: - KONST. NÉV - name()
// LEKÉRÉS: SorSzám - ordinal()
        System.out.println(coin_HNDR.ordinal());

        System.out.println(Arrays.deepToString(coins));
        System.out.println(Arrays.toString(coins));
    }
}
