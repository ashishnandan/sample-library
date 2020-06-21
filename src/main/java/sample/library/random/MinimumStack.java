package sample.library.random;

import sample.library.collection.Stack;

public class MinimumStack<T extends Comparable<T>> {
    private Stack<T> stack;
    private Stack<T> minStack;

    public MinimumStack(Stack<T> stack) {
        this.stack = stack;
        minStack = new Stack<>();
    }

    public void push(T data){

        T min = data;
        if (!minStack.isEmpty() && minStack.peek().compareTo(data) < 0) {
            min = minStack.peek();
        }

        stack.push(data);
        minStack.push(min);
    }

    public T pop(){
        minStack.pop();
        return stack.pop();
    }

    public T getMinimum(){
        return minStack.peek();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        MinimumStack<Integer> minimumStack = new MinimumStack<Integer>(stack);
        minimumStack.push(10);
        minimumStack.push(20);
        minimumStack.push(5);
        minimumStack.push(25);
        minimumStack.push(30);

        System.out.println(minimumStack.getMinimum());
    }
}
