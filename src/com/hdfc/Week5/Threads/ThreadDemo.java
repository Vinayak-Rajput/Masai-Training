package com.hdfc;

public class ThreadDemo {

    static void main() {

        // ThreadA ta = new ThreadA();
        // ThreadB tb = new ThreadB();

        Thread t1 = new Thread(()->{
            for(int i = 1; i <= 50; i++)
                if(i % 2 == 0) System.out.println("Even: " + i);
        });

        t1.start();

        t1 = new Thread(()->{
            for(int i = 1; i <= 50; i++)
                if(i % 2 != 0) System.out.println("Odd: " + i);
        });

        t1.start();

        System.out.println("End of Main");


    }
}
