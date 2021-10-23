package cmdarguments.verse;

public class VerseMain {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println("Edward King, English King, stap by stap ...");
        for (String vers:args) {
            System.out.print(vers+ " ");
        }

        System.out.println();

        for (int i= args.length-1; i>=0; i--) {
            System.out.println(args[i]);
        }
    }
}
