package display;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CheckDisplayTest {

    private final Display display = new Display();

    @Test
    public void testDisplayIsActive() {
            assertNotNull(display);
    }

    @Test
    public void testDisplayIsDisplayingAsthericAndSpace() {
        int[][] arr = {{1, 1, 0}, {0, 1, 0}, {1, 1, 0}};
        String[][] answer = {{"", "", " "}, {" ", "", " "}, {"", "*", " "}};
        assertArrayEquals(answer, display.checkArray(arr));

    }
}
