import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private DllNode head;
    private DllNode tail;
    private int size;

    public void insertAtFront(int value) {

        DllNode node = new DllNode(value);

        if(head == null) {

            head = tail = node;

        } else {

            node.next = head;
            head.prev = node;
            head = node;

        }

        size++;
    }

    public void insertAtLast(int value) {

        DllNode node = new DllNode(value);

        if(head == null) {

            head = tail = node;

        } else {

            tail.next = node;
            node.prev = tail;
            tail = node;

        }

        size++;
    }

    public void deleteAtFront() {

        if(head == null) {
            throw new NoSuchElementException("Linked List = Empty");
        }

        if(head == tail) {

            head = null;
            tail = null;

        } else {

            head = head.next;
            head.prev = null;
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

            tail = tail.prev;
            tail.next = null;

        }

        size--;
    }

    public void displayForward() {

        DllNode temp = head;

        while(temp!=null) {

            System.out.print(temp.data + " ");
            temp = temp.next;

        }

        System.out.println();
    }

    public void displayBackward() {

        DllNode temp = tail;

        while(temp!=null) {

            System.out.print(temp.data + " ");
            temp = temp.prev;

        }

        System.out.println();
    }

    static DllNode add (DllNode node1, DllNode node2) {

        DoublyLinkedList result = new DoublyLinkedList();

        int carry = 0;

        while(node1 != null || node2 != null || carry != 0) {

            int sum = carry;

            if(node1 != null) {

                sum += node1.data;
                node1 = node1.next;

            }

            if(node2 != null) {

                sum += node2.data;
                node2 = node2.next;

            }

            carry = sum / 10;
            int digit = sum % 10;

            DllNode node = new DllNode(digit);

            if(result.head == null) {

                result.head = result.tail = node;

            } else {

                result.tail.next = node;
                node.prev = result.tail;
                result.tail = node;

            }

        }
        return result.head;
    }


    static void main() {

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtFront(30);
        dll.insertAtFront(20);
        dll.insertAtFront(10);

        dll.displayForward();
        dll.displayBackward();

        dll.insertAtLast(40);
        dll.insertAtLast(50);

        dll.displayForward();
        dll.displayBackward();

        dll.deleteAtFront();

        dll.displayForward();
        dll.displayBackward();

        dll.deleteAtLast();

        dll.displayForward();
        dll.displayBackward();

        DoublyLinkedList dllNum1 = new DoublyLinkedList();
        dllNum1.insertAtLast(2);
        dllNum1.insertAtLast(4);
        dllNum1.insertAtLast(3);


        DoublyLinkedList dllNum2 = new DoublyLinkedList();
        dllNum2.insertAtLast(5);
        dllNum2.insertAtLast(6);
        dllNum2.insertAtLast(4);

        DllNode result = add(dllNum1.head, dllNum2.head);

        while(result!=null) {
            System.out.print(result.data + " ");
            result= result.next;
        }

        System.out.println();
    }
}
