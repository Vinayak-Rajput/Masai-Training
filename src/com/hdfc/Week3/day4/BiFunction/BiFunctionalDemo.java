package com.example.functional.FISpecifics;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.BiFunction;

public class BiFunctionalDemo {
    static void main() {
        BiFunction<Integer,Integer,Integer> addTwoNo = (n1,n2) -> n1 + n2;
        System.out.println(addTwoNo.apply(10,20));

        BiFunction<String,String,String> getFullName = (first,second) -> first + " " +second;
        System.out.println(getFullName.apply("Vinayak","Rajput"));

        BiFunction<String,String,Boolean> validateLogin = (userName, password) -> userName.equals("Vinayak") && password.equals("1234");
        System.out.println();

    }
}
