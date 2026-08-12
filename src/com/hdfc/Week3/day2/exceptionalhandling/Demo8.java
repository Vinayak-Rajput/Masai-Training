package com.example.exceptionalhandling;

public class Demo8 {
    public static void main(String[] args) {
        try {
            try {
                int x = 10/0;
            }
            catch(NullPointerException e) {
                System.out.println("Inner Catch");
            }
        }
        catch(Exception e) {
            System.out.println("Outer Catch");
        }
    }
}
