package com.example.exceptionalhandling;

public class Demo1 {
    static void fun() throws ClassNotFoundException{
        try{
            System.out.println("A");
            int x = 10/0;
            System.out.println("B");
        }
        catch(ArithmeticException e){
            System.out.println(e);
            throw new ClassNotFoundException();
        }
        System.out.println("D");
    }
    static void main() {
    try{
        fun();
    }catch(Exception e){
        System.out.println(e);
    }


    }
}
