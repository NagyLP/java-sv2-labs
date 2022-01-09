package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private final String className;
    private final Random random;
    private final List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        if (className == null) {
            throw new NullPointerException
                    ("Classname must not be null. Error data: " + className);
        }
        if (isEmpty(className)) {
            throw new IllegalArgumentException
                    ("Name & Subject must not be empty. Error data: " + className);
        }
        this.className = className;
        this.random = random;
    }

    public boolean addStudent(Student student) {
        if (students == null) {
            throw new NullPointerException("Student list (Class) must not be null. Error data: " + student);
        }
// L Á M
        if (students.toString().contains(student.getName())) {
            return false;
        }
        students.add(student);
        return true;
    }

    public boolean removeStudent(Student student) {
//        if (!addStudent(student)) {
//            throw new NullPointerException("Non-existent class. The class is null. Error data: " + student);
//        }
        if (!students.toString().contains(student.getName())) {
            return false;
        }
        students.remove(student);
        return true;
    }

    public double calculateClassAverage() {
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        int classPieceOfMarks = 0;
        double classAmountOfMarks = 0;
        for (Student item : students) {
            classAmountOfMarks += item.calculateAverage();
            classPieceOfMarks++;
        }
        if (classAmountOfMarks == 0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return Math.floor(classAmountOfMarks / classPieceOfMarks * 100) / 100;
    }

    public double calculateClassAverageBySubject(Subject subject) {
        if (students.isEmpty()) {
            throw new ArithmeticException("Aborted! Zero student, the class is empty. Error data: " + students.size());
        }
        int classPieceOfMarks = 0;
        double classAmountOfMarks = 0;
        for (Student item : students) {
            if (item.calculateSubjectAverage(subject) > .9) {
                classAmountOfMarks += item.calculateSubjectAverage(subject);
                classPieceOfMarks++;
            }
        }
        if (classAmountOfMarks == 0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return Math.floor(classAmountOfMarks / classPieceOfMarks * 100) / 100;
    }

    public Student findStudentByName(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (name == null) {
            throw new NullPointerException("Name cannot be null. Error data: " + name);
        }
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to search!");
        }
        for (Student item : students) {
            if (item.getName().equalsIgnoreCase(name)) {
//  Személy szerint, a fenti tetszetősebb, noha pl. névmódosulás, téves felvitel esetén ÜZEMBIZTOSABB a ->
//          if(item.getName().toLowerCase().contains(name)){
                return item;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    public Student repetition() {
        if (students == null) {
            throw new NullPointerException("Holyday. Not a soul is there. Error data: " + students);
        }
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get((random.nextInt(students.size())));
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> studyResultByName = new ArrayList<>();
        for (Student item : students) {
            studyResultByName.add(new StudyResultByName(item.getName(), item.calculateAverage()));
        }
        return studyResultByName;
    }

    public String listStudentNames() {
        StringBuilder sb = new StringBuilder();
        for (Student item : students) {
            if (!sb.isEmpty()) {
                sb.append(", ");
            }
            sb.append(item.getName());
        }
        return sb.toString();
    }

    public String getClassName() {
        return className;
    }

    public List<Student> getStudents() {
        return students;
    }

    private boolean isEmpty(String str) {
        return str.isBlank();
    }
}
