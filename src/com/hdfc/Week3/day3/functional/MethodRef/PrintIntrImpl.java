package com.example.functional.MethodRef;

public class PrintIntrImpl {
    static void main() {
        PrintIntr pi = System.out::println;
        pi.printOnConsole("Hello Vinayak!");
    }
}
