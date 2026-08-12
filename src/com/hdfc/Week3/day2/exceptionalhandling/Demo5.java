package com.example.exceptionalhandling;

public class Demo5 {
    static void main() {
        try
        {
            try
            {
                int x = 10/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
        }
        catch(Exception e)
        {
            System.out.println("Outer catch");
        }
    }
}
