package classstructureintegrate;

public class Product {

    private final String NAme;
    private int PRice;

    public Product(String name, int price) {
        this.NAme = name;
        this.PRice = price;
    }

    public String getNAme() {return NAme;}
    public int getPRice() {return PRice;}

    public void increasePrice(int price) {PRice = PRice + price;}
    public void decreasePrice(int price) {PRice = PRice - price;}
}
