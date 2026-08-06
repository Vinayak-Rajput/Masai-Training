package com.hdfc.week1.day4;

public class Demo1 {
    static void main() {
        Account acc1 =new Account();
        acc1.setAccountNumber(201212);
        acc1.setCustomerName("Vinayak");

        Account acc2 =new Account();
        acc2.setAccountNumber(305668);
        acc2.setCustomerName("Ravi");

        acc1.withdraw(5000);

        acc2.deposit(3000);

        System.out.println("Account1 Balance: "+acc1.checkBalance());
        System.out.println("Account2 Balance: "+acc2.checkBalance());
    }
}
