package stacker;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private stack myStack;
    @Test
    public void testThatStackHaveASize(){
        myStack = new stack(5);
        assertEquals(myStack.getLength(), 5);

    }

    @Test
    public void testThatStackIsEmpty(){
        myStack = new stack(5);
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void testThatStackCanContainElement() throws Exception {
        myStack = new stack(5);
        myStack.push(3);
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void testThatStackCanContainElementsOfTheSameType() throws Exception {
        myStack = new stack(5);
        myStack.push(3);
        myStack.push(40);
        myStack.push(10);
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void testThatStackCanPopElementStoreInside() throws Exception {
        myStack = new stack(5);
        myStack.push(3);
        myStack.push(40);
        myStack.push(10);
        assertFalse(myStack.isEmpty());
        myStack.pop();
        assertEquals(myStack.getElementNumber(), 2);
    }


    @Test
    public void testThatStackCanPopLastElementStoreInside() throws Exception {
        myStack = new stack(5);
        myStack.push(3);
        myStack.push(40);
        myStack.push(10);
        assertFalse(myStack.isEmpty());
        assertEquals( 10, myStack.pop());
    }

    @Test
    public void testThatStackCanPush123AndPop321() throws Exception {
        myStack = new stack(5);
        myStack.push(3);
        myStack.push(4);
        myStack.push(10);
        assertEquals(myStack.pop(), 10);
        assertEquals(myStack.pop(), 4);
        assertEquals(myStack.pop(), 3);
    }

    @Test
    public void testThatStackCanFull() throws Exception {
        myStack = new stack(5);
        myStack.push(3);
        myStack.push(4);
        myStack.push(10);
        myStack.push(15);
        myStack.push(20);
        assertEquals(myStack.getElementNumber(), 5);
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> myStack.push(32));
    }

    @Test
    public void testThatICanSearchThroughTheStack() throws Exception {
        myStack = new stack(5);
        myStack.push(3);
        myStack.push(4);
        myStack.push(10);
        myStack.push(15);
        myStack.push(20);
        assertEquals(myStack.getElementNumber(), 5);
        assertEquals(myStack.search(15), 2);
    }

    @Test
    public void testThatIfAnElementIsNotInTheStackReturnMinusOne() throws Exception {
        myStack = new stack(5);
        myStack.push(3);
        myStack.push(4);
        myStack.push(10);
        myStack.push(15);
        myStack.push(20);
        assertEquals(myStack.getElementNumber(), 5);
        assertEquals(myStack.search(8), -1);
    }

    @Test
    public void testThatStackShouldReturnTheLastElementEnterWhenPeek(){
        myStack = new stack(5);
        myStack.push(3);
        myStack.push(4);
        myStack.push(10);
        myStack.push(15);
        assertEquals(15, myStack.peek());
    }

    @Test
    public void testThatStackShouldThrowExceptionWhenPopIfStackIsEmpty(){
        myStack = new stack(5);
        assertThrows(EmptyStackException.class, ()-> myStack.pop());
    }

    @Test
    public void testTHatWhenIPOpItWillNotBeInTheStackAgain() throws Exception {
        myStack = new stack(5);
        myStack.push(3);
        myStack.push(4);
        myStack.push(10);
        myStack.pop();
        assertEquals(myStack.search(10), -1);
    }


}


