package com.example.exceptionalhandling;

public class A implements AutoCloseable {
    public A() throws Exception{
        System.out.println("inside constructor of class A");
        //Class.forName("com.example.exceptionalhandling.A1");
    }

    public void funA() throws ArithmeticException{
        System.out.println("Inside funA of a class");
    }

    @Override
    public void close() throws Exception {
        System.out.println("A class is closed.");
    }
}
