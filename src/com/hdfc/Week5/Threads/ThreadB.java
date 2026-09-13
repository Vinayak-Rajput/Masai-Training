package com.hdfc;

public class ThreadB implements Runnable{
    @Override
    public void run() {

        for(int i=0; i <= 50; i++) {
            if(i % 2 != 0) System.out.println("Inside Thread B (ODD): " + i);
        }

        System.out.println("End of Thread B");

    }
}
