package schoolrecords;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MarkTest {

    public static final Subject SUBJECT = new Subject("matematika");
    public static final Tutor TUTOR = new Tutor("Nagy Lilla", Arrays.asList(SUBJECT));


    @Test
    public void nullParameterShouldThrowException() throws NullPointerException {
        Exception ex = assertThrows(NullPointerException.class, () -> new Mark(MarkType.A, null, TUTOR));
        assertEquals("Both subject and tutor must be provided!", ex.getMessage());
    }

    @Test
    public void testCreate() {
        Mark mark = new Mark(MarkType.A, SUBJECT, TUTOR);
        assertEquals(MarkType.A, mark.getMarkType());
        assertEquals(SUBJECT, mark.getSubject());
        assertEquals(TUTOR, mark.getTutor());
//  (MEA culpa, Mea.maxima culpa...) JAVÍTVA: Mi célja tantárgy nélküli (amire vonatkozik a jegy)
//  hozzárendeléssel külön, felülírt String-gé alakítani (Ha nem akarjuk megváltoztatni a TESLA autó piktogrammját, akkor miért gyártunk gyártójelzés nélkül?)
        assertEquals("matematika: excellent(5)", mark.toString());
    }
}
