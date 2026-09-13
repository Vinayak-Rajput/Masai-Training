package Queue;

public class CircularQueue {

    private int[] queue;

    private int front;
    private int rear;
    private int size;

    public CircularQueue(int capacity) {

        queue = new int[capacity];

        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public void enqueue(int data) {

        if (isFull()) {
            throw new IllegalStateException("Queue Overflow");
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = data;
        size++;
    }

    public int dequeue() {

        if (isEmpty()) {
            throw new IllegalStateException("Queue Underflow");
        }

        int removedValue = queue[front];
        front = (front + 1) % queue.length;
        size--;

        return removedValue;
    }

    public int peek() {

        if (isEmpty()) {
            throw new IllegalStateException("Queue Underflow");
        }

        return queue[front];
    }

    public int size() {
        return size;
    }

    public int rear() {

        if (isEmpty()) {
            throw new IllegalStateException("Queue Underflow");
        }

        return queue[rear];
    }


    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = 0; i < size; i++) {
            int index = (front + i) % queue.length;
            System.out.print(queue[index] + " ");
        }

        System.out.println();
    }

    static void main() {

        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

    }

}
