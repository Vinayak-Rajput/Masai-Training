public class UnSafeSequence implements Runnable {
    private int value;

    public int getNext() {

        System.out.println("Value of next from " + Thread.currentThread().getName()+ " Value: " + value);
        return value++;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            getNext();
        }
    }
}
