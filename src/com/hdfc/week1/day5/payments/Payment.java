package com.hdfc.week1.day5.payments;

public abstract class Payment {
    public abstract void pay(double amount);

    public void paymentStarted(){
        System.out.println("Payment process started...");
    }
}

