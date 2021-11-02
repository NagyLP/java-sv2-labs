package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {

    private final List<Person> examPersonList = new ArrayList<>();

    public void addPerson (Person person) {examPersonList.add(person);}

    public List<Person> getPersonList() {
        return examPersonList;
    }
}
