package cmdarguments.flowers;

public class CmdMain {

    public static void main(String[] args) {
        System.out.println(args.length);

         String[] virag1 = {"napraforgó", "ibolya", "rózsa", "harangvirág"};

        for (int i = 0; i < args.length; i++) {
            int sorszam = i + 1;
            System.out.println(sorszam + ". elem: " + args[i]);
        }
        for (int i = 0; i < virag1.length; i++) {
            int sorszam = i + 1;
            System.out.println(sorszam + ". elem:" + virag1[i]);
        }
   System.out.println(args.length);
    }
}
