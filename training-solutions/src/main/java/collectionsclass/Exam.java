package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam {

    private final List<ExamResult> examResults;


    public Exam(List<ExamResult> examResults) {
        this.examResults = examResults;
    }

    public List<ExamResult> getExamResults() {
        return new ArrayList<>(examResults);
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        List<ExamResult> ordered = new ArrayList<>(examResults);
        if (places > ordered.size()) {
            places = ordered.size();
        }
        Collections.sort(ordered);
        Collections.reverse(ordered);
        return getName(ordered, places);
    }

    private List<String> getName(List<ExamResult> ordered, int places) {
        List<String> names = new ArrayList<>();
        for (int i = 1; i < places; i++) {
            names.add(ordered.get(i).getNameOfPerson());
        }
        return names;
    }

//    public List<String> getNamesOfSucceededPeople(int places) {
//        List<ExamResult> ordered = new ArrayList<>(examResults);
//        if (places > ordered.size()) {
//            places = ordered.size();
//        }
//        Collections.sort(ordered);
//        Collections.reverse(ordered);
//        return getNames(ordered, places);
//    }
//
//    private List<String> getNames(List<ExamResult> ordered, int places) {
//        List<String> names = new ArrayList<>();
//        for (int i = 0; i < places; i++) {
//            names.add(ordered.get(i).getNameOfPerson());
//        }
//        return names;
//    }
}
