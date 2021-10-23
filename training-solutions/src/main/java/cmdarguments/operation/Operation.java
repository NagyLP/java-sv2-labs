package cmdarguments.operation;

public class Operation {
    public static void main(String[] args) {
        for (String item:args) {
            if (item.equals("/list")) {
                System.out.println("Listázás");
            } else if (item.equals("/add")) {
                System.out.println("Hozzáadás ");
            } else if (item.equals("/delete")) {
            System.out.println("Törlés");
            } else {
                System.out.println("Ismeretlen művelet.");
            }
        }
    }
}
