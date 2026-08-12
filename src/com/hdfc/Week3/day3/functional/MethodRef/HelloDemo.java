package com.example.functional.MethodRef;

public class HelloDemo {
    HelloDemo(String s){
        System.out.println("In Demo Constructor: "+ s);
    }
    static void main() {
        HelloIntr h1 = new HelloIntrImpl();
        h1.sayHello("Vinayak");

        A.greet("Vinayak");

        HelloIntr h2 = (name) -> System.out.println("Hello using LE: " + name.toUpperCase());
        h2.sayHello("Vinayak");

        HelloIntr h3 = A::greet;
        h3.sayHello("vinayak in method ref");

        HelloIntr h4 = new A()::greet1;
        h4.sayHello("Vinayak");

        HelloIntr h5 = HelloDemo::new;
        h5.sayHello("Ravi");
    }

}
