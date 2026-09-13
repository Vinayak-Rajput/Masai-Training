import java.util.NoSuchElementException;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void insertAtFirst(int value) {
        Node newNode = new Node(value);

        if (head == null || tail == null) {

            head = newNode;
            tail = newNode;

        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    public void insertAtLast(int value) {
        Node newNode = new Node(value);

        if(head == null) {
            head = newNode;
            tail = newNode;

        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;

            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public void insertAt(int index, int value) {

        if(index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Invalid Index Entered");
        }

        if(index == 0) {
            insertAtFirst(value);
            return;
        }

        if (index == size){
            insertAtLast(value);
            return;
        }

        int count = -1;

        Node newNode = new Node(value);
        Node temp = head;

        for(int i = 0; i < index-1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        size++;
    }

    public int getSize() {
        return size;
    }

    public int countNodes() {

        int count = 0;
        Node temp = head;

        while(temp !=  null) {
            temp = temp.next;
            count++;
        }

        return count;
    }

    public boolean contains(int value) {

        Node temp = head;

        if(temp != null) {
            if(temp.data == value) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public int indexOf(int value) {
        int index = -1;

        Node temp = head;
        while(temp != null) {
            index++;

            if(temp.data == value) {
                return index;
            }

            temp = temp.next;
        }

        return -1;
    }


    public void deleteAtFirst() {

        if(head == null) {
            throw new NoSuchElementException("Linked List = Empty");
        }

        if(head == tail) {

            head = null;
            tail = null;

        } else {

            head = head.next;
        }

        size--;

    }

    public void deleteAtLast() {

        if(head == null) {
            throw new NoSuchElementException("Linked List = Empty");
        }

        if(head == tail) {

            head = null;
            tail = null;

        } else {

            Node temp = head;

            while(temp.next.next != null) { // current.next != tail
                temp = temp.next;
            }

            tail = temp;
            temp.next = null;

        }

        size--;
    }

    public void deleteAt(int index) {

        if(index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Invalid Index Entered");
        }

        if(index == 0) {
            deleteAtFirst();
            return;
        }

        if (index == size){
            deleteAtLast();
            return;
        }

        Node temp = head;

        for(int i = 0; i < index-1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

    }

    public void reversal() {


        Node temp = head;
        head = tail;
        tail = temp;

        Node prev = null;

        while(temp != null) {

            Node current = temp.next;
            temp.next = prev;
            prev = temp;

            temp=current;
        }

    }

    public void middleValue() {

        if(head == null) return;

        if(head.next == null) {
            System.out.println(head.data);
            return;
        }

        if(head.next.next == null) {
            System.out.println(head.next.data);
            return;
        }

        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!= null) {

            fast = fast.next.next;
            slow = slow.next;

        }

        System.out.println(slow.data);
    }

    public void checkLoop() {

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) {
                System.out.println("Cycle Detected!");
                return;
            }
        }

        System.out.println("No Cycle Detected!");
    }

    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }


    static void main() {
        LinkedList llist = new LinkedList();

        llist.insertAtFirst(50);
        llist.insertAtFirst(40);
        llist.insertAtFirst(30);
        llist.insertAtFirst(20);
        llist.insertAtFirst(10);

        System.out.println("Original Linked List: ");
        llist.display();

        System.out.println();

        llist.insertAtLast(60);
        llist.insertAtLast(70);
        llist.insertAtLast(80);

        System.out.println("Linked List (After 3 Insertions at Last): ");
        llist.display();

        System.out.println();

        llist.deleteAtFirst();
        llist.deleteAtFirst();

        System.out.println("Linked List (After 2 Deletions at First): ");
        llist.display();

        System.out.println();

        llist.deleteAtLast();

        System.out.println("Linked List (After Deletion at Last): ");
        llist.display();

        System.out.println();

        System.out.println("Count of Nodes: " + llist.countNodes());

        System.out.println("Index of element 60: " + llist.indexOf(60));

        System.out.println();

        llist.insertAt(2,100);

        System.out.println("Linked List (After Insertion of 100 at Index 2): ");
        llist.display();

        System.out.println();

        llist.deleteAt(2);

        System.out.println("Linked List (After Deletion at Index 2): ");
        llist.display();

        System.out.println();

        llist.reversal();

        System.out.println("Linked List (After Reversal): ");
        llist.display();

        System.out.println();

        System.out.println("Middle Value of Linked List: ");
        llist.middleValue();

        System.out.println();

        System.out.println("Is Cycle Present in List 1 ? ");
        llist.checkLoop();

        LinkedList llist2 = new LinkedList();

        llist2.insertAtFirst(30);
        llist2.insertAtFirst(20);
        llist2.insertAtFirst(10);
        llist2.tail.next = llist2.head;

        System.out.println("Is Cycle Present in List 2 ? ");
        llist2.checkLoop();
    }



}
