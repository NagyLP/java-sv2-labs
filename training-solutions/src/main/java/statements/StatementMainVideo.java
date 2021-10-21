package statements;

public class StatementMainVideo {

    public static void main(String[] args) {

        int i = 5 + 6;
        System.out.println( 5 + 6 );

        System.out.println( "Hello" + i + "World!" );

        StatementMainVideo s = new StatementMainVideo();

        System.out.println( i = 8 );

// STRING összehasonlítás
        System.out.println("".equals("aaa"));
        System.out.println( "aaa".equals("aaa"));


        System.out.println( ! (i % 2 == 0) || true);

        i++;
        i = i + 1;
        System.out.println(i);

        System.out.println(i % 2 == 0 ? "páros" : "páratlan");
    }
}
