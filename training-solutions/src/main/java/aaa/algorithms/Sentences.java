package aaa.algorithms;

import java.util.ArrayList;
import java.util.List;

import static aaa.algorithms.Errors.*;


public class Sentences {

    public static final String SEN_END_MARKS = ".?!";
    List<String> sentences = new ArrayList<>();

    public void addSentence(String sentence) {
        switch (sentenceChecker(sentence)) {
            case UPPER_CASE_ERROR -> throw new IllegalArgumentException("Sentence must start with capital!");
            case ENDING_MARK_ERROR -> throw new IllegalArgumentException("Sentence must end with ending mark!");
            case ADD_ITEM -> sentences.add(sentence);
        }
    }

    public String findLongestSentence() {
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

    public static Errors sentenceChecker(String sentence) {
        if (sentence.charAt(0) != sentence.toUpperCase().charAt(0))
            return UPPER_CASE_ERROR;
        if (!SEN_END_MARKS.contains(Character.toString(sentence.charAt(sentence.length() - 1))))
            return ENDING_MARK_ERROR;
        return ADD_ITEM;
    }

    public List<String> getSentences() {
        return sentences;
    }
}
