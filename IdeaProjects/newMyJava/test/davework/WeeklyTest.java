package davework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WeeklyTest {

    private Weekly weekly;
    @BeforeEach
    public void setUp() {
        weekly = new Weekly();
    }

    @Test
    public void testThatWeeklyExist(){
        assertNotNull(weekly);
    }

    @Test
    public void testIfSubjectsAreOfferedOnMonday(){
        assertEquals("Math, English", weekly.monday());
    }

    @Test
    public void testForTuesdaySubject(){
        assertEquals("Geography, Biology", weekly.tuesday());
    }

    @Test
    public void testForWednesdaySubject(){
        assertEquals("English, Biology", weekly.wednesday());
    }

    @Test
    public void testForThursdaySubject(){
        assertEquals("Goland, Chemistry", weekly.thursday());
    }
}
