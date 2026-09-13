package Queue;

public class CircularArrayDeque {

    private int[] deque;

    private int front;
    private int rear;
    private int size;

    public CircularArrayDeque(int capacity) {

        deque = new int[capacity];

        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public boolean isFull() {

        return size == deque.length;
    }

    public int size() {

        return size;
    }

    public void addFirst(int data) {

        if (isFull()) {

            throw new IllegalStateException("Deque Overflow");
        }

        front = (front - 1 + deque.length) % deque.length;

        deque[front] = data;

        size++;

        if (size == 1) {

            rear = front;
        }
    }

    public void addLast(int data) {

        if (isFull()) {

            throw new IllegalStateException("Deque Overflow");
        }

        rear = (rear + 1) % deque.length;

        deque[rear] = data;

        size++;

        if (size == 1) {

            front = rear;
        }
    }

    public int removeFirst() {

        if (isEmpty()) {

            throw new IllegalStateException("Deque Underflow");
        }

        int removedValue = deque[front];

        front = (front + 1) % deque.length;

        size--;

        return removedValue;
    }

    public int removeLast() {

        if (isEmpty()) {

            throw new IllegalStateException("Deque Underflow");
        }

        int removedValue = deque[rear];

        rear = (rear - 1 + deque.length) % deque.length;

        size--;

        return removedValue;
    }

    public int peekFirst() {

        if (isEmpty()) {

            throw new IllegalStateException("Deque Underflow");
        }

        return deque[front];
    }

    public int peekLast() {

        if (isEmpty()) {

            throw new IllegalStateException("Deque Underflow");
        }

        return deque[rear];
    }

    public void display() {

        if (isEmpty()) {

            System.out.println("Deque is Empty");
            return;
        }

        System.out.print("Deque: ");

        for (int i = 0; i < size; i++) {

            int index = (front + i) % deque.length;

            System.out.print(deque[index] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        CircularArrayDeque deque = new CircularArrayDeque(5);

        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);

        deque.display();

        deque.addFirst(5);

        deque.display();

        deque.addFirst(1);

        deque.display();

        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        System.out.println("Removed First: " + deque.removeFirst());

        deque.display();

        System.out.println("Removed Last: " + deque.removeLast());

        deque.display();

        System.out.println("Size: " + deque.size());
    }
}

