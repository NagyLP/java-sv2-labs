package recursion;

public class Vowels {

    public int getNumberOfVowels(String word) {

        if (word.length() > 0) {
            int count = switch (word.charAt(0)) {
                case 'a', 'á', 'e', 'é', 'i', 'í', 'o', 'ó', 'ö', 'ő', 'u', 'ú', 'ü', 'ű' -> 1;
                default -> 0;
            };
            return count + getNumberOfVowels(word.substring(1));
        }
        return 0;
    }

//    public int getNumberOfVowels(String word) {
//        String vowels = "aáeéiíoóöőuúüű";
//        if (word.length() == 0) {
//            return 0;
//        }
//        if (vowels.indexOf(word.charAt(0)) >= 0) {
//            return 1 + getNumberOfVowels(word.substring(1));
//        } else {
//            return 0 + getNumberOfVowels(word.substring(1));
//        }
//    }
}
