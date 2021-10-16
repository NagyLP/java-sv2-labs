package classstructureconstructors;

public class Book {

    private String author;
    private String title;
    private int regNumber;

    public Book() {
        this.author = author;
        this.title = title;
        this.regNumber = regNumber;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRegNumber() {
        return regNumber;
    }
    public void register(int regNumber) {
        this.regNumber = regNumber;
    }
}
