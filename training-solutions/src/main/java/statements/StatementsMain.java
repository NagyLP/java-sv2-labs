package statements;

public class StatementsMain {

    public static void main(String[] args) {

        int x = 5 + 6;

        int y = 11 - x;

        int z = 8;

        boolean b = (x > y);

        System.out.println(b);

        boolean c = (b = true) || (z > 5);

        z++;

        System.out.println( x+ " " +y+ " " +z+ " " +b+ " " +c);
    }
}
