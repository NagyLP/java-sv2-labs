package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    public static Student student = new Student();

    @Test
   public void testAddNote() {
        student.addNote(4);
        student.addNote(5);
        student.addNote(1);

        assertEquals(3, student.getStudentGrade().size(),"Rendben");
        assertEquals(5, student.getStudentGrade().get(1).intValue(),"OK");
    }

    @Test
    public void testaddInvalidNoteTestMessage() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Student().addNote(6));

        assertEquals("Note must be between 1 and 5!", iae.getMessage());
    }
}