public class UnSafeSequenceDemo {
    static void main() {

        UnSafeSequence unSafeSequence = new UnSafeSequence();

        Thread thread1 = new Thread(unSafeSequence);
        Thread thread2 = new Thread(unSafeSequence);

        thread1.start();
        thread2.start();

    }
}
