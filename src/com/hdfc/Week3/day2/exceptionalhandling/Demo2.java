package com.example.exceptionalhandling;

public class Demo2 {
    static void main() {
        try{
            int arr[] = new int[5];
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic");
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
