package attributes.bill;

public class BillItem {

    private String product;
    private int price;
    private int quantity;
    private double VatPercent;

    public BillItem(String product, int price, int quantity, double VatPercent) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.VatPercent = VatPercent;
    }

    public double calculateTotalPrice() {return getPrice()*getQuantity()*(VatPercent/100+1);}

    public String getProduct() {
        return product;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getVatPercent() {
        return VatPercent;
    }
}
