package com.hdfc.week1.day4.constructors;

public class ADemo {
    static void main() {
        A obj = A.returnA();
        obj.funA();
        String str = obj.getClass().getName();  //returns String
        Class sre  = obj.getClass(); //returns Class name
        System.out.println(sre);

    }
}
