package com.hdfc.ThreadOptimization;

public class SumThreadsDemo {
    static void main() throws InterruptedException {

        long startTime = System.currentTimeMillis();

        SumThreads thread1 = new SumThreads(0, Integer.MAX_VALUE/2);
        SumThreads thread2 = new SumThreads(Integer.MAX_VALUE/2 + 1, Integer.MAX_VALUE);

        Thread threadA =  new Thread(thread1);
        Thread threadB = new Thread(thread2);

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        long endTime = System.currentTimeMillis();

        long result = thread1.getResult() + thread2.getResult();

        System.out.println(result);

        System.out.println("Time Taken: " + (endTime - startTime));

        SumInt.sumCal();

    }
}
