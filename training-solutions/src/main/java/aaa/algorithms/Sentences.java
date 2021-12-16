package aaa.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Sentences {

    public static final String SEN_END_MARKS = ".?!";
    List<String> sentences = new ArrayList<>();

    public void addSentence(String sentence) {
        switch (sentenceChecker(sentence)) {
            case "UpperCase Error" -> throw new IllegalArgumentException("Sentence must start with capital!");
            case "EndingMark Error" -> throw new IllegalArgumentException("Sentence must end with ending mark!");
            case "Örülünk Vince" -> sentences.add(sentence);
        }
    }

    public String findLongestSentence() throws IllegalArgumentException {
        try {
            String lenghtestSentence = sentences.get(0);
            for (String item : sentences) {
                if (item.length() > lenghtestSentence.length()) {
                    lenghtestSentence = item;
                }
            }
            return lenghtestSentence;
        } catch (IndexOutOfBoundsException ibe) {
            throw new IllegalStateException();
        }
    }

    public static String sentenceChecker(String sentence) {
        if (sentence.charAt(0) != sentence.toUpperCase().charAt(0))
            return "UpperCase Error";
        if (!SEN_END_MARKS.contains(Character.toString(sentence.charAt(sentence.length() - 1))))
            return "EndingMark Error";
        return "Örülünk Vince";
    }

    public List<String> getSentences() {
        return sentences;
    }
}
