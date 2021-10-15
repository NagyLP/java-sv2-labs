package intromaven;

public class Bonusz_1 {
    public static void main(String[] args) {
        System.out.println("1. Validálás");
        System.out.println("2. Létrehoz: Forrás");
        System.out.println("3. Folyamat: Forrás");
        System.out.println("4. Létrehoz: Erőforrás");
        System.out.println("5. Folyamat: Erőforrás");
        System.out.println("6. Lefordítás: mvn compile");
        System.out.println("7. Teszt: Folyamat-Forrás");
        System.out.println("8. Teszt: Folyamat-Erőforrás");
        System.out.println("9. Teszt: Leordítás: mvn test - lefordított tesztosztályok->target/classes/");
        System.out.println("10. Unit Test-ek fordítása/futtatása");
        System.out.println("11. Becsomagolás (*.jar)");
        System.out.println("12. Bemásolás (*.jar->lokális repo-ba)");
        System.out.println("13. Telepítés (alkalmazásszerverre)");
        System.out.println();
        System.out.println("Hozzáadható célkok:");
        System.out.println("assembly:assembly");
        System.out.println("site");
        System.out.println("site-deploy");
    }
}
