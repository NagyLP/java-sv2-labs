package A_Training;

public class Main {

//    static int b, h;
//
//    static {
//        try (Scanner scan = new Scanner(System.in)) {
//            b = scan.nextInt();
//            h = scan.nextInt();
//        }
//    }

    public static void main(String[] args) {
//        Scanner scanIn = new Scanner(System.in);
//
//        String regex = "(\\s|^)([a-z]+)(\\s+\\2)+(?=(?:\\s|$))";
//        Pattern pattern = Pattern.compile(
//                regex, Pattern.CASE_INSENSITIVE);
//        String numSentences = scanIn.nextLine();
//
//        while (!numSentences.isEmpty()) {
//            String input = scanIn.nextLine();
//            Matcher match = pattern.matcher(input);
//            boolean findMatch = true;
//
//            while (match.find()) {
//                input = match.replaceAll("$1");
//                findMatch = false;
//            }
//            System.out.println(input);
//        }
//        scanIn.close();

//        Scanner scan = new Scanner(System.in);
//        Main mainSolution = new Main();
//
//        int round = scan.nextInt();
//        for(int i=0; i<round; i++) {
//            int a = scan.nextInt();
//            int b = scan.nextInt();
//            int n = scan.nextInt();
//
//            mainSolution.innerFor(a, b, n);
//
//            System.out.println();
//        }
//    }
//
//    private void innerFor(int a, int b, int n) {
//        for(int j=0; j<n; j++) {
//            a += b * (int) Math.pow(2, j);
//            System.out.print(a + " ");
//        }

//        Scanner scan = new Scanner(System.in);
//        int data = scan.nextInt();
//
//        for (int i = 0; i < data; i++) {
//            try {
//                long inputNumber = scan.nextLong();
//                System.out.println(inputNumber + " can be fitted in:");
//                if (inputNumber >= Byte.MIN_VALUE
//                        && inputNumber <= Byte.MAX_VALUE)
//                    System.out.println("* byte");
//                if (inputNumber >= Short.MIN_VALUE
//                        && inputNumber <= Short.MAX_VALUE) {
//                    System.out.println("* short");
//                }
//                if (inputNumber >= Integer.MIN_VALUE
//                        && inputNumber <= Integer.MAX_VALUE)
//                    System.out.println("* int");
//                if (inputNumber >= (Long.MIN_VALUE)
//                        && inputNumber <= (Math.pow(2, 63) - 1))
//                    System.out.println("* long");
//
//            } catch (Exception ioe) {
//                System.out.println(scan.next() + " can't be fitted anywhere.");
//            }
//        }

//        try (Scanner scan = new Scanner(System.in)) {
//            int count = 0;
//            while (scan.hasNextLine()) {
//                count++;
//                System.out.println(
//                        String.format(
//                                "%d %s", count, scan.nextLine()));
//            }
//        }

//        if (!(b > 0) || !(h > 0)) {
//            System.out.println("java.lang.Exception: Breadth and height must be positive");
//        } else {
//            System.out.println(b * h);
//        }
//        System.exit(0);

//        try (Scanner scan = new Scanner(System.in)) {
//            int number = scan.nextInt();
//            Main main = new Main();
//            main.validatorOfInput(number);
//            String str = String.valueOf(number);
//
//            if (number == Integer.parseInt(str)) {
//                System.out.println("Good job");
//            }
//            else {System.out.println("Wrong answer.");
//            }
//        }
//    }
//
//    private void validatorOfInput(int number) {
//        if (!(number >= -100) || !(number <= 100)) {
//            System.out.println("Out of range.");
//        }

    }
}

