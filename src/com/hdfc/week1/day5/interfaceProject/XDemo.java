package com.hdfc.week1.day5.interfaceProject;

public class XDemo {

    static void main() {

        X x = (a) -> a > 0;

        System.out.println(x.isPositive(-2));
        System.out.println(x.isPositive(2));
    }
}
