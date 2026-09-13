package Stack;

import java.util.HashMap;
import java.util.NoSuchElementException;

public class LinkedListStack {

    private Node head;
    private int size;

    private static HashMap<Character,Character> hmap;

    static {
        hmap = new HashMap<>();
        hmap.put('(',')');
        hmap.put('[',']');
        hmap.put('{','}');
    }

    public static void addPairToMap(Character ch1, Character ch2) {
        hmap.put(ch1,ch2);
    }

    public static Character getPairedCharacter(Character ch) {
        return hmap.get(ch);
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        size++;
    }

    public int pop() {

        if (isEmpty()) {
            throw new NoSuchElementException("Stack Underflow: No Element Exist.");
        }

        int removedValue = head.data;

        head = head.next;
        size--;

        return removedValue;
    }


    public int peek() {

        if (isEmpty()) {
            throw new NoSuchElementException("Stack Underflow: No Element Exist.");
        }

        return head.data;
    }

    public int size() {
        return size;
    }


    public void display() {

        if (isEmpty()) {
            throw new NoSuchElementException("Stack Underflow: No Element Exist.");
        }

        System.out.println("Stack Elements (Top to Bottom): ");
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    static void main() {

        LinkedListStack stack = new LinkedListStack();

        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);

        stack.display();

    }
}
