package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SchoolTest {


    @Test
    void getNumberOfStudentsTest() {
        School school = new School();

        List<Integer> headcounts = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        assertEquals(150, school.getNumberOfStudents(headcounts));
    }
}