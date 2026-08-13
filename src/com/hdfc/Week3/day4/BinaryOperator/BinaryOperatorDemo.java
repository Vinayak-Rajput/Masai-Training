package com.example.functional.FISpecifics;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    static void main() {
        BinaryOperator<String>  fullNamer = (s,t) -> s+" "+t;
        System.out.println(fullNamer.apply("Shenoy","Roy"));
    }
}
