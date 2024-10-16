package queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queue queue;

    @Test
    public void testThatQueueHaveSize() {
        queue = new Queue(5);
        assertEquals(queue.size(), 5);
    }

    @Test
    public void testThatQueueIsEmpty() {
        queue = new Queue(5);
        assertTrue(queue.isEmpty());
    }
    @Test
    public void testThatQueueCanAddElement() {
        queue = new Queue(5);
        queue.add(6);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testThatQueueCanAddTwoOrMoreElements() {
        queue = new Queue(5);
        queue.add(6);
        queue.add(7);
        queue.add(80);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testThatQueueIsFull() {
        queue = new Queue(5);
        queue.add(6);
        queue.add(7);
        queue.add(80);
        queue.add(90);
        queue.add(100);
        assertFalse(queue.isEmpty());
        assertThrows(StackOverflowError.class, () -> queue.add(87));
    }

    @Test
    public void testThatQueueCanRemoveElement() {
        queue = new Queue(5);
        queue.add(6);
        queue.add(7);
        queue.add(80);
        queue.add(90);
        queue.add(100);
        assertEquals(queue.countElement(), 5);
        queue.remove();
        assertEquals(queue.countElement(), 4);
    }

    @Test
    public void testThatQueueCanRemoveAllElements() {
        queue = new Queue(5);
        queue.add(6);
        queue.add(7);
        queue.add(80);
        queue.add(90);
        queue.add(100);
        assertEquals(queue.countElement(), 5);
        queue.remove();
        assertEquals(queue.countElement(), 4);
        queue.remove();
        assertEquals(queue.countElement(), 3);
        queue.remove();
        assertEquals(queue.countElement(), 2);
        queue.remove();
        assertEquals(queue.countElement(), 1);
        queue.remove();
        assertEquals(queue.countElement(), 0);
    }

    @Test
    public void testThatQueueCanNotRemoveWhenStackIsEmpty() {
        queue = new Queue(5);
        assertTrue(queue.isEmpty());
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> queue.remove());
    }

    @Test
    public void testThatQueueCanRemoveElementFromTheFront(){
        queue = new Queue(5);
        queue.add(6);
        queue.add(7);
        queue.add(80);
        queue.add(90);
        queue.add(100);
        assertEquals(queue.remove(), 6);
    }

    @Test
    public void testThatQueueCantRemoveElementAndTheElementIsNotThere(){
        queue = new Queue(5);
        queue.add(6);
        queue.add(7);
        queue.add(80);
        queue.add(90);
        queue.add(100);
        assertEquals(queue.remove(), 6);
        assertEquals(queue.remove(), 7);
        assertEquals(queue.remove(), 80);
        assertEquals(queue.countElement(), 2);
    }

    @Test
    public void testThatICanViewTheLastElement(){
        queue = new Queue(5);
        queue.add(6);
        queue.add(7);
        queue.add(80);
        queue.add(90);
        queue.remove();
        assertNotEquals(queue.element(), 6);
        assertEquals(queue.element(), 7);
    }
}
