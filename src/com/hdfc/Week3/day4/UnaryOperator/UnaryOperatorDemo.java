package com.example.functional.FISpecifics;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    static void main() {
        UnaryOperator<String> strUpper = String::toUpperCase;
        System.out.println(strUpper.apply("House of Dragon"));
    }
}
