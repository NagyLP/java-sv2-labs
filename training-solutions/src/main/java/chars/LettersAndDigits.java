package chars;

public class LettersAndDigits {

    public void printLetterOrDigit(String text) {
        char[] chars = text.toCharArray();
        for (char item : chars) {

            if (Character.isAlphabetic(item)) {
                System.out.println(item+ " => betű");
            }
                else if (Character.isDigit(item)) {
                System.out.println(item+ "=> szám");
            }
                else if (Character.isWhitespace(item)) {
                System.out.println(item+ " => láthatatlan karakter");
            }
                else {System.out.println(item+ " => egyéb");}
        }
    }

    public static void main(String[] args) {
        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        lettersAndDigits.printLetterOrDigit("Ez+Az - ~1995");
    }
}
