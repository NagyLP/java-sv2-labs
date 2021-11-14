package controlselection.accents;

public class WithoutAccents {

    public static final String LETTERS_WITH_ACCENTS = "áéíóöőúüűÁÉÍÓÖŐÚÜŰ";
    public static final String LETTERS_WITHOUT_ACCENTS = "aeiooouuuAEIOOOUUU";

    public char charWithoutAccents(char c) {
        int indexAccents = LETTERS_WITH_ACCENTS.indexOf(c);
        if (indexAccents >= 0) {
            return LETTERS_WITHOUT_ACCENTS.charAt(indexAccents);
        } else {
            return c;
        }
    }
}
