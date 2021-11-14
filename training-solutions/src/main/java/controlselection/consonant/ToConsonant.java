package controlselection.consonant;

public class ToConsonant {

    public static final String VOWELS = "aeiou";

    public char toConsonant(char x) {
        if (VOWELS.indexOf(x) >= 0) {
            return (char) (x + 1);
        } else {
            return x;
        }
    }
}
