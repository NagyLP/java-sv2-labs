package attributes.book;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem a könyv címét: ");
        Book book1 = new Book (sc.nextLine());
        System.out.println("Kérem a 2. könyv címét: ");
        Book book2 = new Book(sc.nextLine());
        System.out.println("Kérem a 3. könyv címét: ");
        Book book3 = new Book(sc.nextLine());

        System.out.println("Javítsuk ki ki kérem a 3. könyv címét: ");
        book3.setTitle(sc.nextLine());

        System.out.println(book1.getTitle()+ ", " +book2.getTitle()+ ", " +book3.getTitle());
        System.out.println(Book.class.getName());
    }
}
