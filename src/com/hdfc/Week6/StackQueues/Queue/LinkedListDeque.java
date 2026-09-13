package Queue;

public class LinkedListDeque {

    private Node head;
    private Node tail;
    private int size;

    public boolean isEmpty() {

        return size == 0;
    }

    public int size() {

        return size;
    }

    public void addFirst(int data) {

        Node newNode = new Node(data);

        if (isEmpty()) {

            head = newNode;
            tail = newNode;
        }

        else {

            newNode.next = head;
            head.prev = newNode;

            head = newNode;
        }

        size++;
    }

    public void addLast(int data) {

        Node newNode = new Node(data);

        if (isEmpty()) {

            head = newNode;
            tail = newNode;
        }

        else {

            tail.next = newNode;
            newNode.prev = tail;

            tail = newNode;
        }

        size++;
    }

    public int removeFirst() {

        if (isEmpty()) {

            throw new IllegalStateException("Deque Underflow");
        }

        int removedValue = head.data;

        if (head == tail) {

            head = null;
            tail = null;
        }

        else {

            head = head.next;
            head.prev = null;
        }

        size--;

        return removedValue;
    }

    public int removeLast() {

        if (isEmpty()) {

            throw new IllegalStateException("Deque Underflow");
        }

        int removedValue = tail.data;

        if (head == tail) {

            head = null;
            tail = null;
        }

        else {

            tail = tail.prev;
            tail.next = null;
        }

        size--;

        return removedValue;
    }

    public int peekFirst() {

        if (isEmpty()) {

            throw new IllegalStateException("Deque Underflow");
        }

        return head.data;
    }

    public int peekLast() {

        if (isEmpty()) {

            throw new IllegalStateException("Deque Underflow");
        }

        return tail.data;
    }

    public void displayForward() {

        if (isEmpty()) {

            System.out.println("Deque is Empty");
            return;
        }

        System.out.print("Deque: ");

        Node current = head;

        while (current != null) {

            System.out.print(current.data + " ");

            current = current.next;
        }

        System.out.println();
    }

    public void displayBackward() {

        if (isEmpty()) {

            System.out.println("Deque is Empty");
            return;
        }

        System.out.print("Deque (Reverse): ");

        Node current = tail;

        while (current != null) {

            System.out.print(current.data + " ");

            current = current.prev;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        LinkedListDeque deque = new LinkedListDeque();

        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);

        deque.displayForward();

        deque.addFirst(5);
        deque.addFirst(1);

        deque.displayForward();

        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last : " + deque.peekLast());

        System.out.println("Removed First: " + deque.removeFirst());

        deque.displayForward();

        System.out.println("Removed Last: " + deque.removeLast());

        deque.displayForward();

        deque.displayBackward();

        System.out.println("Size: " + deque.size());
    }
}



