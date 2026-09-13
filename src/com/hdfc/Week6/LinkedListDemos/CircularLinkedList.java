import java.util.NoSuchElementException;

public class CircularLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void insertAtFront(int value) {
        Node node = new Node(value);

        if(head == null) {

            head = node;
            tail = head;
            tail.next = head;

        } else {

            node.next = head;
            head = node;
            tail.next = head;

        }

        size++;
    }

    public void insertAtLast(int value) {
        Node node = new Node(value);

        if(head == null) {

            head = tail = node;
            tail.next = head;

        } else {

            tail.next = node;
            tail = node;
            tail.next = head;
        }

        size++;
    }

    public void deletionAtFront() {

        if(head == null){
            throw new NoSuchElementException("No element to delete.");
        }

        if(head == tail) {

            head = null;
            tail = null;

        } else {

            head =  head.next;
            tail.next = head;

        }

        size--;
    }

    public void deleteAtLast() {

        if(head == null){
            throw new NoSuchElementException("No element to delete.");
        }

        if(head == tail) {

            head = null;
            tail = null;

        } else {

            Node temp = head;

            while(temp.next != tail) {
                temp = temp.next;
            }

            tail = temp;
            tail.next = head;

        }

        size--;
    }



    public void display() {

        Node temp = head.next;

        System.out.print(head.data + " ");

        while(temp != head) {

            System.out.print(temp.data + " ");
            temp = temp.next;

        }

        System.out.println();
    }



    static void main() {

        CircularLinkedList cll = new CircularLinkedList();

        cll.insertAtFront(50);
        cll.insertAtFront(40);
        cll.insertAtFront(30);
        cll.insertAtFront(20);
        cll.insertAtFront(10);

        cll.display();


    }
}
