package Queue;

public class PriorityQueueLinkedList {

    private PriorityNode head;
    private int size;

   

    public boolean isEmpty() {

        return size == 0;
    }

    public int size() {

        return size;
    }

    public void insert(int data, int priority) {

        PriorityNode newNode = new PriorityNode(data, priority);

        newNode.next = head;
        head = newNode;

        size++;
    }

    public int remove() {

        if (isEmpty()) {

            throw new IllegalStateException("Priority Queue Underflow");
        }

        PriorityNode current = head;
        PriorityNode maxNode = head;

        PriorityNode previous = null;
        PriorityNode maxPrevious = null;

        while (current != null) {

            if (current.priority > maxNode.priority) {

                maxNode = current;
                maxPrevious = previous;
            }

            previous = current;
            current = current.next;
        }

        if (maxPrevious == null) {

            head = head.next;
        }

        else {

            maxPrevious.next = maxNode.next;
        }

        size--;

        return maxNode.data;
    }

    public int peek() {

        if (isEmpty()) {

            throw new IllegalStateException("Priority Queue Underflow");
        }

        PriorityNode current = head;
        PriorityNode maxNode = head;

        while (current != null) {

            if (current.priority > maxNode.priority) {

                maxNode = current;
            }

            current = current.next;
        }

        return maxNode.data;
    }

    public void display() {

        if (isEmpty()) {

            System.out.println("Priority Queue is Empty");
            return;
        }

        PriorityNode current = head;

        System.out.println("Data(Priority):");

        while (current != null) {

            System.out.println(
                    current.data + "(" + current.priority + ")");

            current = current.next;
        }
    }

    public static void main(String[] args) {

        PriorityQueueLinkedList pq = new PriorityQueueLinkedList();

        pq.insert(10, 2);
        pq.insert(20, 5);
        pq.insert(30, 1);
        pq.insert(40, 8);

        pq.display();

        System.out.println("Highest Priority Element: "+ pq.peek());

        System.out.println("Removed: "+ pq.remove());

        pq.display();
    }
}
