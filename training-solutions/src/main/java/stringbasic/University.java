package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students = new ArrayList<>();

    public boolean areEqual(Student student, Student anotherStudent) {
        return student.getNeptunCode().equals(anotherStudent.getNeptunCode())
                && student.getEducationID().equals(anotherStudent.getEducationID());
    }

    public void addStudent (Student student) {
        students.add(student);}

    public List<Student> getStudent() {return students;}
}
