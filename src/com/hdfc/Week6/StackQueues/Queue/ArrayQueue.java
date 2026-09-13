package Queue;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private int[] queue;

    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int capacity) {

        queue = new int[capacity];

        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return rear == queue.length - 1;
    }

    public void enqueue(int data) {

        if (isFull()) {
            throw new IllegalStateException("Queue Overflow");
        }

        rear++;
        queue[rear] = data;
        size++;
    }

    public int dequeue() {

        if (isEmpty()) {
            throw new NoSuchElementException("Queue has No Elements.");
        }

        int removedValue = queue[front];
        front++;
        size--;

        return removedValue;
    }

    public int peek() {

        if (isEmpty()) {
            throw new NoSuchElementException("Queue has No Elements.");
        }

        return queue[front];
    }

    public int rear() {

        if (isEmpty()) {
            throw new NoSuchElementException("Queue has No Elements.");
        }

        return queue[rear];
    }


    public int size() {
        return size;
    }

    public void display() {

        if (isEmpty()) {
            throw new NoSuchElementException("Queue has No Elements.");
        }

        System.out.println("Queue: ");

        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]+" ");
        }

    }

    static void main() {

        ArrayQueue q = new ArrayQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();
    }

}
