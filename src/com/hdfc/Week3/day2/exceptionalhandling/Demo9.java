package com.example.exceptionalhandling;

public class Demo9 {
    public static void main(String[] args) {
        try {
            System.out.println("Try");
            System.exit(0);
        }
        finally {
            System.out.println("Finally");
        }
    }
}
