package com.hdfc.week1.day5.payments;

public class UPIPayment extends Payment{

    public void pay(double amount){
        System.out.println("Paid amount " + amount + " using UPI");
    }

}
