package collectionsset;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {

    public Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> orderInLessons = new TreeSet<>();
        for (Student student : students) {
            orderInLessons.add(student.getHeight());
        }
        return orderInLessons;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nagy László", 123));
        students.add(new Student("Kis László", 135));
        students.add(new Student("Makro László", 122));
        students.add(new Student("Mikro László", 132));
        students.add(new Student("Nano Tasziló", 130));

        PhysicalEducation physicalEducation = new PhysicalEducation();
        System.out.println(physicalEducation.getOrderInLessons(students));
    }
}
