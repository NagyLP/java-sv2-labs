package attributes.bill;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
      BillItem item1 = new BillItem("Bélás", 2, 1, 27);
      BillItem item2 = new BillItem("Billenytűzet", 5, 1, 27);
      BillItem item3 = new BillItem("Zománcfesték", 2500, 1, 27);

       System.out.println("Ezek vannak Billnél: ");
        System.out.println(item1.getProduct()+", "+item2.getProduct()+", "+item3.getProduct());
       System.out.println("Bill dolgainak ára: ");
        System.out.println(item1.getPrice()+", "+item2.getPrice()+", "+item3.getPrice());
        System.out.println("Dolgai mennyisége: ");
        System.out.println(item1.getQuantity()+ item2.getQuantity()+ item3.getQuantity());
        System.out.println("Termékek ÁFA tartamai: ");
        System.out.println(item1.getVatPercent());
        System.out.println(item2.getVatPercent());
        System.out.println(item3.getVatPercent());
        System.out.println();
        double total = item1.calculateTotalPrice()+item2.calculateTotalPrice()+item3.calculateTotalPrice();
        System.out.println("..ééés mindösszesen Fával: " +total);

    }
}
