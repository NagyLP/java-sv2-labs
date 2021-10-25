package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

       public static void main(String[] args) {

        new Book();
//        System.out.println(Book());

        Book emptyBook;
//        System.out.println(emptyBook);

        emptyBook=null;
        System.out.println(emptyBook);

        System.out.println(emptyBook==null ? "null érték" : "hull érték");

        Book book = new Book();
        System.out.println(book);

        book = null;
        System.out.println(book);

        book = new Book();
        System.out.println(book);

        Book anotherBook = new Book();
        System.out.println(book == anotherBook);

        System.out.println(anotherBook=book);

        System.out.println(book == anotherBook);

        Book[] books = {new Book(), new Book(), new Book()};

       List<Book> booksList_Array = new ArrayList<>(Arrays.asList(new Book(), new Book(), new Book()));
       List<Book> booksList_List = Arrays.asList(new Book(), new Book(), new Book());
           System.out.println(booksList_Array+"\n"+booksList_List);

       List<Book> bookObject = new ArrayList<>();
       bookObject.add(new Book());
       bookObject.add(new Book());
       bookObject.add(new Book());

       System.out.println(bookObject);
    }
}
