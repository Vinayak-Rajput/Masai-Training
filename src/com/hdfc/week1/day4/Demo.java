package com.hdfc.week1.day4;

public class Demo {
    int x=200;
    A a1=new A();
    static void main() {
        Demo d1=new Demo();
        System.out.println(d1);
        System.out.println(d1.x);
        System.out.println(d1.a1);
        d1.a1.funA();
    }
}
