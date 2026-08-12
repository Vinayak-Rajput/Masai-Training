package com.example.exceptionalhandling;

public class Demo3 {
    static void main() {
        try {
            Class.forName("Demo");
            return;
        } catch (ClassNotFoundException | ArithmeticException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally");
        }
    }
}

