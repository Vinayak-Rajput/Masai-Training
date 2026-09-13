package Queue;

public class LinkedListQueue {

    private Node head;
    private Node tail;
    private int size;

    private static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public int size() {

        return size;
    }

    public void enqueue(int data) {

        Node newNode = new Node(data);

        if (isEmpty()) {

            head = newNode;
            tail = newNode;
        }

        else {

            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public int dequeue() {

        if (isEmpty()) {

            throw new IllegalStateException("Queue Underflow");
        }

        int removedValue = head.data;

        head = head.next;

        if (head == null) {

            tail = null;
        }

        size--;

        return removedValue;
    }

    public int peek() {

        if (isEmpty()) {

            throw new IllegalStateException("Queue Underflow");
        }

        return head.data;
    }

    public int rear() {

        if (isEmpty()) {

            throw new IllegalStateException("Queue Underflow");
        }

        return tail.data;
    }

    public void display() {

        if (isEmpty()) {

            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");

        Node current = head;

        while (current != null) {

            System.out.print(current.data + " ");

            current = current.next;
        }

        System.out.println();
    }

    static void main() {

        LinkedListQueue q = new LinkedListQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();

        System.out.println("Front element: " + q.peek());
        System.out.println("Rear element: " + q.rear());
        System.out.println("Queue size: " + q.size());

        System.out.println("Dequeued: " + q.dequeue());

        q.display();

        q.enqueue(50);

        System.out.println("After enqueue 50:");

        q.display();

        System.out.println("Front element: " + q.peek());
        System.out.println("Rear element: " + q.rear());
        System.out.println("Queue size: " + q.size());
    }
}
