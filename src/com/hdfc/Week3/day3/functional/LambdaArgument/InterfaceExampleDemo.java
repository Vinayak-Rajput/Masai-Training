package com.example.functional.LambdaArgument;

public class InterfaceExampleDemo {
    static void funA(InterfaceExample iExample){

        System.out.println("Inside Method funA() of InterfaceExampleDemo ");

        iExample.display(20);

    }

    static void main() {
        funA((x)-> System.out.println("Value of x passed to InterfaceExample's display() method: " + x));
    }
}
