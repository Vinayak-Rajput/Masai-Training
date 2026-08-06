package com.hdfc.week1.day5.interfaceProject;

public class CreditCardPayment implements Payment {
    public void pay(double amount){
        System.out.println("Paid "+ amount +" using Credit Card");
    }
}
