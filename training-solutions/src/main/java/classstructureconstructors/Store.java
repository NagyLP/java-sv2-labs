package classstructureconstructors;

public class Store {

    private String pRoduct;
    private int sTock;
    private int qUantity;

    public Store (String product, int sTock) {
            this.pRoduct = product;
            sTock = 0;
        }

    public String getpRoduct() {
        return pRoduct;}
    public void setpRoduct(String pRoduct) {
        this.pRoduct = pRoduct;}
    public int getsTock() {
        return sTock;}
    public void setsTock(int sTock) {
        this.sTock = sTock;}

    public void store (int quantity) {this.qUantity = quantity;
        sTock = sTock + this.qUantity;
    }
    public void dispatch (int quantity) {this.qUantity = quantity;
        sTock = sTock - qUantity;
    }
}
