package enumtype.firstenum;

public enum Coin {

    TOWOHUNDRED(200), HUNDRED(100), TWENTY(20), TEN(10), FIVE(5);

    private final int value;


    Coin(int value) {
            this.value = value;
        }

    public String toString(int value) {
        return "Coin{" +
                "value=" + this.value +
                '}';
    }

    public int getValue() {
        return value;
    }
}
