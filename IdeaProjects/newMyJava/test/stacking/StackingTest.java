package stacking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackingTest {

    private Stacking stack;
    @BeforeEach
    public void setUp() {
        stack = new Stacking();
    }

    @Test
    public void checkIfStackingIsEmptyTest() {
        assertTrue((stack.isEmpty()));
    }

    @Test
    public void checkIfStackingIsNotEmptyWhilepushingAnElementTest() {
        assertTrue((stack.isEmpty()));
        stack.pushing("davidson");
        assertFalse((stack.isEmpty()));
    }

    @Test
    public void checkIfStackingIsNotEmptyWhilepoppingAnElementTest() {
        assertTrue((stack.isEmpty()));
        stack.pushing("Davidson");
        assertFalse((stack.isEmpty()));
        stack.poping();
        assertTrue((stack.isEmpty()));
    }

    @Test
    public void checkIfStackingIsNotEmptyWhilepoppingElementsTest() {
        assertTrue((stack.isEmpty()));
        stack.pushing("Davidson");
        stack.pushing("James");
        stack.pushing("Daniel");
        assertFalse((stack.isEmpty()));
        stack.poping();
        assertFalse((stack.isEmpty()));
    }

    @Test
    public void checkingTheSizeOfStackingTest() {
        assertTrue((stack.isEmpty()));
        stack.pushing("Davidson");
        stack.pushing("James");
        stack.pushing("Daniel");
        assertFalse((stack.isEmpty()));
        stack.poping();
        assertFalse((stack.isEmpty()));
    }


    @Test
    public void checkingTheCapacityTest() {
        assertTrue((stack.isEmpty()));
        stack.pushing("Davidson");
        stack.pushing("James");
        stack.pushing("Daniel");
        assertFalse((stack.isEmpty()));
        stack.poping();
        assertFalse((stack.isEmpty()));
        System.out.println("The stack size is: " + stack.checkSize());
        assertEquals(2, stack.getCapacity());
    }

    @Test
    public void checkingIfStackIsFullTest() {
        assertTrue((stack.isEmpty()));
        stack.pushing("Davidson");
        stack.pushing("James");
        stack.pushing("Daniel");
        assertFalse((stack.isEmpty()));
        stack.poping();
        assertFalse((stack.isEmpty()));
        System.out.println("the capacity is: " + stack.getCapacity());
    }
}

