package com.hdfc.day1;

public class Demo1 {
    static void main() {
        int i= 10, j =20;
        System.out.println("Before Swap: "+ i + " " + j);
        i =i^j;
        j =i^j;
        i =i^j;
        System.out.println("After Swap: "+ i + " " + j);
    }
}
