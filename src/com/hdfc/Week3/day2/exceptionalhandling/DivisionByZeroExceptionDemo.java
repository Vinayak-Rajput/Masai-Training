package com.example.exceptionalhandling;

import java.util.Scanner;

public class DivisionByZeroExceptionDemo {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Num1: ");
        int num1=sc.nextInt();

        System.out.println("Enter Num2: ");
        int num2=sc.nextInt();

        double result = 0;

        try{
            result = (double) num1 / num2;
            System.out.println("Division Result: " + result);
        }catch(ArithmeticException ae){
            System.out.println("Exception Occurred: " +ae);
            ae.printStackTrace();
        }finally{
            System.out.println("Code Gracefully ended");
        }
    }
}
