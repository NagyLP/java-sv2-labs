//package 0.algorithms;
//
//import java.util.ArrayList;
//import java.util.List;
//import static 0.algorithms.Errors.*;
//
//
//public class Sentences {
//
//    public static final String SEN_END_MARKS = ".?!";
//    List<String> sentences = new ArrayList<>();
//
//    public void addSentence(String sentence) {
//        switch (sentenceChecker(sentence)) {
//            case ERRORS_UPPER_CASE -> throw new IllegalArgumentException(0.algorithms.Errors.values()[1].toString());
//            case ERRORS_ENGING_MARK -> throw new IllegalArgumentException(0.algorithms.Errors.values()[2].toString());
//            case ADD_ITEM -> sentences.add(sentence);
//        }
//    }
//
//    public String findLongestSentence() {
//        try {
//            String lenghtestSentence = sentences.get(0);
//            for (String item : sentences) {
//                if (item.length() > lenghtestSentence.length()) {
//                    lenghtestSentence = item;
//                }
//            }
//            return lenghtestSentence;
//        } catch (IndexOutOfBoundsException ibe) {
//            throw new IllegalStateException();
//        }
//    }
//
//    public aaa.algorithms.Errors sentenceChecker(String sentence) {
//        if (sentence.charAt(0) != sentence.toUpperCase().charAt(0))
//            return ERRORS_UPPER_CASE;
//        if (!SEN_END_MARKS.contains(Character.toString(sentence.charAt(sentence.length() - 1))))
//            return ERRORS_ENGING_MARK;
//        return ADD_ITEM;
//    }
//
//    public List<String> getSentences() {
//        return sentences;
//    }
//}
