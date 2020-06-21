package sample.library.collection;

public class Stack<T> {
    private static int MAX_SIZE = 50;

    private Element<T> top;
    private int size = 0;

    public void push(T data){
        if (size == MAX_SIZE) throw new StackOverflowError();

        Element element = new Element(data, top);
        top = element;
        size++;
    }

    public T pop(){
        if (size == 0) throw new RuntimeException("Stack is empty");
        T data = top.getData();

        top = top.getNext();
        size --;
        return data;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public T peek() {
        return top.getData();
    }


}
