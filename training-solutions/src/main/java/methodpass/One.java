package methodpass;

public class One {

    public int addOne(int number) {
        number++;
        return number;
    }

    public static void main(String[] args) {

        int number = 0;
        System.out.println(number);

        System.out.println(new One().addOne(number));

        System.out.println(number);


    }
}
