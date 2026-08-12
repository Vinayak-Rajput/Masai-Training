package com.example.exceptionalhandling;

public class Demo7 {
    static int test() {
        int x = 10;
        try {
            return x;
        }
        finally {
            x = 20;
        }
    }
    public static void main(String[] args) {
        System.out.println(test());
    }
}
