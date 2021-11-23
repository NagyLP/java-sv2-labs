package introexceptionthrow;

public class AdultContent {

    public static void main(String[] args) {

        Adult adult = new Adult("Buzi Borbála", 99);

        System.out.println(adult.getName());
        System.out.println(adult.getAge());

        System.out.println();

        Adult youngAdult = new Adult("Pöttöm Panna", 17);

        System.out.println(youngAdult.getName());
        System.out.println(youngAdult.getAge());
    }
}
