package com.hdfc.week1.day5.payments;

public class CreditCardPayment extends Payment {

    public void pay(double amount){
        System.out.println("Paid amount " + amount + " using Credit Card.");
    }

}
