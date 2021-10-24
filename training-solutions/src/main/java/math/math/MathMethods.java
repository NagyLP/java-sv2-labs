package math.math;

public class MathMethods {
    public static void main(String[] args) {

        System.out.println(Math.max(-0, +0));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.PI);
        System.out.println(Math.round(Math.PI));
        System.out.println(Math.round(5.5));
        System.out.println(Math.abs(-3.14159265));
        System.out.println(Math.negateExact(1));
        System.out.println(Math.addExact(90, 10));
        System.out.println(Math.subtractExact(90, 10));
        System.out.println(Math.multiplyExact(-4, -5));
// HATVÁNY
        System.out.println(Math.pow(5.0, 3.0));
// ADOTTnál EGGYEL NAGYOBBAT AD
        System.out.println(Math.incrementExact(5));
// Adottnál eggyel KEVESEBBET ad
        System.out.println(Math.decrementExact(5));
        System.out.println(Math.random());
    }
}
