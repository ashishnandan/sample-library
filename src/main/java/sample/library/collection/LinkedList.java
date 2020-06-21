package sample.library.collection;

public class LinkedList<E> {
    private Node<E> first;
    private int size;

    static class Node<E> {
        private E item;
        private Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    '}';
        }
    }

    public int size() {
        return size;
    }

    public void add(E data) {
        if (first == null)
            first = new Node(data, null);
        else {
            getLast().next = new Node<>(data, null);
        }
        size++;
    }

    private Node<E> getLast() {
        if (first == null) return null;
        Node<E> last = first;
        while (last.next != null) {
            last = last.next;
        }
        return last;
    }

    public E get(int index) {
        if (index > size || index < 0) return null;
        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.item;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        Node<E> node = first;
        while (node != null) {
            output.append(node.toString());
            if (node.next != null) output.append(", ");
            node = node.next;
        }
        return output.toString();
    }

    Node<E> reverse()
    {
        Node<E> prev = null;
        Node<E> current = first;
        Node<E> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        first = prev;
        return first;
    }
}

