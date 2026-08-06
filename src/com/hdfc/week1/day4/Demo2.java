package com.hdfc.week1.day4;

public class Demo2 {

    A getObject(int amount){

        if(amount >= 1000){

            System.out.println("Inside getObject() of class Demo2 by Vinayak");
            System.out.println("Creating and returning the A class object");
            return new A();

        }else{

            System.out.println("Transactional unsuccessful. No Object returned");
            return null;
        }
    }

    static void main() {

        A obj1 = new Demo2().getObject(2000);

        if(obj1 != null) obj1.funA();
        else System.out.println("Object 1 is null, so no funA() called");

        A obj2 = new Demo2().getObject(200);

        if(obj2 != null) obj1.funA();
        else System.out.println("Object 2 is null, so no funA() called");

    }
}
