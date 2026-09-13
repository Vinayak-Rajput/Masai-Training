package com.hdfc.ThreadOptimization;

public class SumThreads implements Runnable{

    private long startValue;
    private long endValue;

    private long result = 0;

    public SumThreads(long startValue, long endValue) {
        this.startValue = startValue;
        this.endValue = endValue;
    }

    @Override
    public void run() {

        for(long i = startValue; i <= endValue; i++) {
            result += i;
        }

    }

    public long getResult() {
        return result;
    }
}
