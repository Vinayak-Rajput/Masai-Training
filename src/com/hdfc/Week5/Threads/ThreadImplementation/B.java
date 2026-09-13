package com.hdfc.ThreadImplementation;

public class B extends Thread {
    @Override
    public void run() {
        System.out.println("In run() of B.");

        for(int i = 0; i<20000;i++) {
            System.out.println(Thread.currentThread().getName() + " Value: " + i);
        }

        System.out.println("End of run() of B.");
    }
}
