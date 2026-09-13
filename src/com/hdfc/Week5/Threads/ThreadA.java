package com.hdfc;

public class ThreadA implements Runnable{

    @Override
    public void run() {

        for(int i=1; i <= 50; i++) {
            if(i%2==0) System.out.println("Inside Thread A (EVEN): " + i);
        }

        System.out.println("End of Thread A");

    }

}
