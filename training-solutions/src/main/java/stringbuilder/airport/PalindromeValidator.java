package stringbuilder.airport;

public class PalindromeValidator {

    public boolean isPalindrome (String word) {
        StringBuilder sb = new StringBuilder(word.trim());
        return word.trim().equalsIgnoreCase(sb.reverse().toString());
    }

    public static void main(String[] args) {
        PalindromeValidator palindromeValidator = new PalindromeValidator();
        System.out.println(palindromeValidator.isPalindrome("Találat"));
        System.out.println(palindromeValidator.isPalindrome("Gizi"));
        System.out.println(palindromeValidator.isPalindrome("   "));
        System.out.println(palindromeValidator.isPalindrome("  \n  "));
        System.out.println(palindromeValidator.isPalindrome(" Indulagörögaludni "));

    }
}
