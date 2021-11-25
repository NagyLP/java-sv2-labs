package introexceptionthrowjunit5;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Integer> studentGrade = new ArrayList<>();


    public void addNote(int note) {
        if (note < 1 || 5 < note) {
            throw new IllegalArgumentException("Note must be between 1 and 5!");
        }
        studentGrade.add(note);
    }

    public List<Integer> getStudentGrade() {
        return studentGrade;
    }
}
