package methodchain;

public class ModifiedWord {

    public String modify(String word) {
        return word.toUpperCase().substring(0, 3).replace(word.toUpperCase().charAt(1), 'x') + "y";
    }
}