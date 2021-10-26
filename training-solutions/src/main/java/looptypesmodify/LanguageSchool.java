package looptypesmodify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Para zita");
        Student student2 = new Student("Mecc Elek");
        Student student3 = new Student("Keksz Elek");
        Student student4 = new Student("Mezei Virág");
        Student student5 = new Student("Mász Kálmán");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        student1.setActive(false);
        student5.setActive(false);

        System.out.println(students.size());

        List<Student> studentsClean = new ArrayList<>();
        for (Student item:students) {
            if (!item.isActive()) {
                studentsClean.add(item);
            }
        }
        students.removeAll(studentsClean);
        System.out.println(students.size());
        System.out.println(students);
        System.out.println(students);
    }
}
