package conversions;

public class TooBigNumber {

    public long getRightResult(int number) {
//        long result = number + 2_147_483_647L;
        long result = (long) number + 2_147_483_647;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new TooBigNumber().getRightResult(2100000000));
    }
}
