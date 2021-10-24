package looptypes;

import looptypesmodify.Student;

import java.util.Arrays;
import java.util.List;

public class StudyGroup {
    public void printStudyGroups(List<String> students) {
        for (String item:students) {
            if (item.length()>10 ) {
                System.out.println(item + " - 1-es csoportba.");
            } else {
                System.out.println(item + " - 2-es csoportba.");
            }
        }
    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("Gipsz-Mész Béla", "Futó Rózsa", "Szög János", "Vas Ali", "Mindignyári Ibolya");
        StudyGroup studyGroup = new StudyGroup();
        studyGroup.printStudyGroups(students);
    }

}
