package com.hdfc;

public class ThreadC implements Runnable{
    @Override
    public void run() {

        for(int i=4; i <= 50; i++) {
            System.out.println("Inside Thread C " + i);
        }

        System.out.println("End of Thread C");


    }
}
