package algorithmssum.school;

import java.util.List;

public class School {

    public int getNumberOfStudents(List<Integer> headcounts) {
        int sumOfStudents = 0;
        for (Integer item : headcounts) {
            sumOfStudents += item;
        }
        return sumOfStudents;
    }
}
