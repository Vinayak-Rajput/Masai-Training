package com.example.exceptionalhandling;

public class Demo extends A{
    public Demo() throws Exception {
        System.out.println("Inside Constructor of Demo class.");
    }

    @Override
    public void funA(){
        System.out.println("Inside funA() of Demo class.");
    }

    static void main() {
        Demo d1;
        try(A a = new A()) {
            d1 = new Demo();
            d1.funA();
        }catch(Exception e) {
            System.out.println("Exception Occured: " + e);
        }
    }
}
