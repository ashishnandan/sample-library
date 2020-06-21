package sample.library.collection;

import junit.framework.TestCase;

public class LinkedListTest extends TestCase {

    public void testSize() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        assertEquals(4, list.size());
        assertEquals(10, (int) list.get(0));
        assertEquals(20, (int)list.get(1));
        assertEquals(30, (int)list.get(2));
        assertEquals(40, (int)list.get(3));
        System.out.println(list.toString());

        list.reverse();
        System.out.println(list.toString());
    }

    public void testAddFirst() {
    }
}