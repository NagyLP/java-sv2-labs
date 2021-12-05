package algorithmstransformation.students;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {

    private final List<Person> personList;

    public PrimarySchool(List<Person> personList) {
        this.personList = personList;
    }

    public void addperson(Person person) {
        personList.add(person);
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        for (Person item : personList) {
            if (item.getAge() >= 6 && item.getAge() <= 14) {
                students.add(new Student(item.getName(), item.getAddress()));
            }
        }
        return students;
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
