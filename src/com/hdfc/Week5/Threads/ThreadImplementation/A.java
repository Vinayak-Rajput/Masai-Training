package com.hdfc.ThreadImplementation;

public class A implements Runnable{
    @Override
    public void run() {
        System.out.println("In run() of A.");

        for(int i = 0; i<20000;i++) {
            System.out.println(Thread.currentThread().getName() + " Value: " + i);
        }

        System.out.println("End of run() of A.");
    }
}
