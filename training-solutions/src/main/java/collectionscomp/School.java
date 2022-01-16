package collectionscomp;

import java.text.Collator;
import java.util.*;

public class School {

    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new StudentComparator());
        Student firstStudent = new Student("Erős Antónia", 100);
        Student secondStudent = new Student("Cérna Géza", 199);
        students.add(firstStudent);
        students.add(secondStudent);

        System.out.println(students);

        Map<String, Integer> studentsOrder = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));
        studentsOrder.put(firstStudent.getName(), firstStudent.getHeight());
        studentsOrder.put(secondStudent.getName(), secondStudent.getHeight());

        System.out.println(studentsOrder);
    }
}
