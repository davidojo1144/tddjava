package myset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MySetTest {
    private MySet set;

    @Test
    public void testThatSetHaveLength() {
        set = new MySet(6);
        assertEquals(set.getLength(), 6);
    }

    @Test
    public void testThatSetIsEmpty() {
        set = new MySet(6);
        assertTrue(set.isEmpty());
    }

    @Test
    public void testThatSetCanAddElementAndSetIsNotEmpty() {
        set = new MySet(6);
        assertTrue(set.add(5));
    }

    @Test
    public void testThatSetCanNotAddExistingElement() {
        set = new MySet(6);
        assertTrue(set.add(5));
        assertTrue(set.add(2));
        assertTrue(set.add(7));
        assertFalse(set.add(5));
    }

    @Test
    public void testToCheckIfAnElementIsAlsoInASet() {
        set = new MySet(6);
        set.add(5);
        set.add(7);
        set.add(3);
        set.add(15);
        set.add(9);
        assertTrue(set.contain(15));
    }

    @Test
    public void testThatShouldReturnFalseIfAnElementIsNotInASet() {
        set = new MySet(6);
        set.add(5);
        set.add(7);
        set.add(3);
        set.add(15);
        set.add(9);
        assertTrue(set.contain(15));
        assertFalse(set.contain(2));
    }

    @Test
    public void testThatReturnsTheNumberOfElementsInASet() {
        set = new MySet(6);
        set.add(5);
        set.add(7);
        set.add(3);
        set.add(9);
        assertEquals(set.size(), 4);
        set.add(31);
    }

    @Test
    public void testThatRemoveAnElementFromTheSet() {
        set = new MySet(6);
        set.add(5);
        set.add(7);
        set.add(3);
        set.add(9);
        assertTrue(set.remove(3));
        assertFalse(set.contain(8));
    }

    @Test
    public void testTHatICanNotRemoveAnElementThatIsNotInASet() {
        set = new MySet(6);
        set.add(5);
        set.add(7);
        set.add(3);
        set.add(9);
        assertFalse(set.remove(8));
        assertEquals(set.size(), 4);
    }

    @Test
    public void testThatICanClearTheSetAtOnce() {
        set = new MySet(6);
        set.add(5);
        set.add(7);
        set.add(3);
        set.add(9);
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    public void testTHatWhenIClearICanNotFindTheElementAgain() {
        set = new MySet(6);
        set.add(5);
        set.add(7);
        set.add(3);
        set.add(9);
        set.clear();
        assertTrue(set.isEmpty());
        assertFalse(set.contain(5));
        assertFalse(set.contain(7));
    }

    @Test
    public void testToCompareACollectionOfNUmberWithTheSet() {
        set = new MySet(6);
        set.add(5);
        set.add(7);
        set.add(3);
        set.add(9);
        int[] number = {5, 7, 3, 9};
        assertTrue(set.containsAll(number));
    }

    @Test
    public void testToCompareCollectionOfNUmberWhichIndexIsNotSameWithTheSetShouldReturnTrue() {
        set = new MySet(6);
        set.add(5);
        set.add(7);
        set.add(3);
        set.add(9);
        int[] number = {9, 3, 5, 7};
        assertTrue(set.containsAll(number));
    }

    @Test
    public void testToCompareCollectionOfNumberWhichIsMoreThanTheSet() {
        set = new MySet(6);
        set.add(5);
        set.add(7);
        set.add(3);
        set.add(9);
        int[] number = {9, 3, 5, 7, 9, 56, 32};
        assertFalse(set.containsAll(number));
    }

}

