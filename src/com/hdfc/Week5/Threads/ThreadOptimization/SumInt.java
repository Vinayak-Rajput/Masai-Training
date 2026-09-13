package com.hdfc.ThreadOptimization;

public class SumInt {
    static void sumCal() {
        long startTime = System.currentTimeMillis();

        long result = 0;

        for(int i = 0; i <= Integer.MAX_VALUE - 1; i++) {
            result += i;
        }

        System.out.println(result);

        long endTime = System.currentTimeMillis();

        System.out.println("Time Taken without threads: " + (endTime - startTime));
    }
}
