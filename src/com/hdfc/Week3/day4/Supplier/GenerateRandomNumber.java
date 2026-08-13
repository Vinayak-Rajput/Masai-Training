package com.example.functional.FISpecifics;

import java.util.function.Supplier;

public class GenerateRandomNumber {
    static void main() {
        Supplier<Integer> otpSupplier = () -> (int)(Math.random()*1000000);

        System.out.println(otpSupplier.get());
    }
}
