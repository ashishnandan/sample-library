package sample.library.collection;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void stackTest() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        assertEquals(1, stack.size());
        stack.push(20);
        assertEquals(2, stack.size());

        assertEquals(20, (int) stack.pop());
        assertEquals(1, stack.size());
        assertEquals(10, (int) stack.pop());
        assertEquals(0, stack.size());
        assertTrue(stack.isEmpty());

        stack.push(50);
        stack.push(500);
        stack.push(560);

        assertEquals(560, (int)stack.peek());
        assertEquals(3, stack.size());
        assertFalse(stack.isEmpty());
    }
}