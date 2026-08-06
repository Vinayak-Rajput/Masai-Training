package com.hdfc.week1.day4.constructors;

public class A {

    public void funA(){
        System.out.println("Inside funA of A class");
    }

    private A(){
        System.out.println("Inside the constructor of A()");
    }

    public static A returnA(){ // Static Factory Pattern
        return new A();
    }

}
