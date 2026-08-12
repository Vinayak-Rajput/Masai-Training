package com.example.functional.MethodRef;

public class HelloIntrImpl implements HelloIntr{
    @Override
    public void sayHello(String name) {
        System.out.println("Using external Class");
        System.out.println("Hello "+name);
    }
}
