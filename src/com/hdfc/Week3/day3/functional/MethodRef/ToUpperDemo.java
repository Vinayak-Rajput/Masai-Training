package com.example.functional.MethodRef;

public class ToUpperDemo {
    static void main() {
        ToUpper to = String::toUpperCase;
        System.out.println(to.makeUpper("ravi"));
    }
}
