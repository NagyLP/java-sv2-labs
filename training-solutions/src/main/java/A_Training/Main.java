package A_Training;

//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//import java.util.Scanner;

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


//        public static String findDay ( int month, int day, int year) {
//            Calendar calendar = Calendar.getInstance();
//            calendar.set(Calendar.MONTH, month-1);
//            calendar.set(Calendar.DAY_OF_MONTH, day);
//            calendar.set(Calendar.YEAR, year);
//            return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
//        }

//        try (Scanner scan = new Scanner(System.in)) {
//            double payment = scan.nextDouble();
//
//            System.out.println(
//                    "US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
//            System.out.println(
//                    "India: " + NumberFormat.getCurrencyInstance(new Locale("en", "India: ")).format(payment));
//            System.out.println(
//                    "China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
//            System.out.println(
//                    "France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();
//
//        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
//        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
//        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
//        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
//
//        System.out.println("US: " + us.format(payment));
//        System.out.println("India: " + india.format(payment));
//        System.out.println("China: " + china.format(payment));
//        System.out.println("France: " + france.format(payment));

//        try (Scanner input = new Scanner(System.in)) {
//            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
//            messageDigest.reset();
//            messageDigest.update(input.nextLine().getBytes());
//            for (byte item : messageDigest.digest()) {
//                System.out.print(String.format("%02x", item));
//            }
//        } catch (NoSuchAlgorithmException nsae) {
//            nsae.printStackTrace();
//        }

//        try (Scanner input = new Scanner(System.in)) {
//            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
//            messageDigest.reset();
//            messageDigest.update(input.nextLine().getBytes());
//            for (byte item : messageDigest.digest()) {
//                System.out.print(String.format("%02x", item));
//            }
//        } catch (NoSuchAlgorithmException nsae) {
//            nsae.printStackTrace();
//        }

//        public PerformOperation isOdd () {
//            return (a) -> {
//                return (a % 2 == 1);
//            };
//        }
//        public PerformOperation isPrime () {
//            return (a) -> {
//                for (int i = 2; i <= a / 2; i++) {
//                    if (a % i == 0)
//                        return false;
//                }
//                return true;
//            };
//        }
//
//        public boolean checkPalindrome(String str, int s, int e)
//        {
//            if (s == e)    // If there is only one character
//                return true;
//            // If first and last characters do not match
//            if ((str.charAt(s)) != (str.charAt(e)))
//                return false;
//            // If there are multiple characters, check if
//            // middle substring is also palindrome or not.
//            if (s < e + 1)
//                return checkPalindrome(str, s + 1, e - 1);
//            return true;
//        }

//        public static int összeadás(List<Integer> ar) {
//            return ar.stream().mapToInt(Integer::intValue).sum();
//        }


    }
}
