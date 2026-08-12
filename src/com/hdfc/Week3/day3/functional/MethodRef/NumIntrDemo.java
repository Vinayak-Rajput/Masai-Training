package com.example.functional.MethodRef;

public class NumIntrDemo {
    static void main() {
        NumIntr n1 = Integer::parseInt;
        System.out.println(n1.getNumber("21".trim())+ 40);
    }
}
