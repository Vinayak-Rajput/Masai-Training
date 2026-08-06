package com.hdfc.week1.day5.interfaceProject;

public class UPIPayment implements Payment{
    public void pay(double amount){
        System.out.println("Paid "+ amount +" using UPI");
    }
    public void rewardPoints(){
        System.out.println("Points awarded");
    }
}
