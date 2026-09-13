package Queue;

public class PriorityQueueArray {

    private Element[] queue;
    private int size;

    

    public PriorityQueueArray(int capacity) {

        queue = new Element[capacity];
        size = 0;
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public boolean isFull() {

        return size == queue.length;
    }

    public int size() {

        return size;
    }

    public void insert(int data, int priority) {

        if (isFull()) {

            throw new IllegalStateException("Priority Queue Overflow");
        }

        queue[size] = new Element(data, priority);

        size++;
    }


    //getting the highest priority element
    public int peek() {

        if (isEmpty()) {

            throw new IllegalStateException("Priority Queue Underflow");
        }

        int highestPriorityIndex = 0;

        for (int i = 1; i < size; i++) {

            if (queue[i].priority > queue[highestPriorityIndex].priority) {

                highestPriorityIndex = i;
            }
        }

        return queue[highestPriorityIndex].data;
    }



    public int remove() {

        if (isEmpty()) {

            throw new IllegalStateException("Priority Queue Underflow");
        }

        int highestPriorityIndex = 0;

        for (int i = 1; i < size; i++) {

            if (queue[i].priority > queue[highestPriorityIndex].priority) {

                highestPriorityIndex = i;
            }
        }

        int removedValue = queue[highestPriorityIndex].data;

        queue[highestPriorityIndex] = queue[size - 1];

        queue[size - 1] = null;

        size--;

        return removedValue;
    }


    public void display() {

        if (isEmpty()) {

            System.out.println("Priority Queue is Empty");
            return;
        }

        System.out.println("Data(Priority):");

        for (int i = 0; i < size; i++) {

            System.out.println(
                    queue[i].data + "(" + queue[i].priority + ")");
        }
    }

    public static void main(String[] args) {

        PriorityQueueArray pq = new PriorityQueueArray(10);

        pq.insert(10, 2);
        pq.insert(20, 5);
        pq.insert(30, 1);
        pq.insert(40, 8);
        pq.insert(50, 3);

        pq.display();

        System.out.println();

        System.out.println("Highest Priority Element: " + pq.peek());

        System.out.println("Removed: "+ pq.remove());

        System.out.println();

        pq.display();
    }
}
