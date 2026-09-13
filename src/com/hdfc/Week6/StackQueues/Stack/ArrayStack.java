package Stack;

import java.util.NoSuchElementException;

public class ArrayStack {

    private final int[] items;
    private int top;

    public ArrayStack(int capacity) {
        items = new int[capacity];
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == items.length - 1;
    }

    public void push(int item) {

        if (isFull()) {
            throw new IllegalStateException("Stack Overflow: Stack is full");
        }

        items[++top] = item;
    }

    public int pop() {

        if (isEmpty()) {
            throw new NoSuchElementException("Stack Underflow: No Element Exist.");
        }

        return items[top--];
    }

    public int peek() {

        if (isEmpty()) {
            throw new NoSuchElementException("Stack Underflow: No Element Exist.");
        }

        return items[top];
    }

    public void display() {

        if (isEmpty()) {
            throw new NoSuchElementException("Stack Underflow: No Element Exist.");
        }

        System.out.println("Stack Elements (Top to Bottom): ");

        for (int i = size() - 1; i >= 0; i--) {
            System.out.print(items[i] + " ");
        }

        System.out.println();

    }

    static void main() {

        ArrayStack stack = new ArrayStack(5);

        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);

        stack.display();

    }

}
