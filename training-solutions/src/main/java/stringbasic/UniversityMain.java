package stringbasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniversityMain {

    public static void main(String[] args) {
        University university = new University();

        Person person = new Person("Mekk Elek", "sdf@sdf.org", "234-234-234", "12345678-12345678-87654321", "555-12345");
        Person personSecond = new Person("Kekk Huba", "sfdgdf@gfddf.org", "234-234-234", "15678-12378-874321", "5-145");
        Person personThird = new Person("Kekk Huba", "sfdgdf@gfddf.org", "234-234-234", "15678-12378-874321", "5-145");

        Student student = new Student(person, "4321", "0001");
        Student studentSecond = new Student(personSecond, "1234", "0002");
        Student studentThird = new Student(personThird, "1234", "0002");

        System.out.println(university.areEqual(studentSecond, studentThird));
        System.out.println(university.areEqual(student, studentThird));

        student.setEntrCardNum("Ezt gépeld be.");
        student.getEntrCardNum();

        university.addStudent(student);

        List<Student> studentList = university.getStudent();

        System.out.println(studentList.toString());
        System.out.println(studentList.size());
    }
}
