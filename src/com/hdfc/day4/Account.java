package com.hdfc.day4;

public class Account {
    static String bankName = "HDFC";
    static String ifscCode = "CMBR0000";
    static String branchName = "Borivali";

    private int accountNumber;
    private String customerName;
    private double balance = 5000;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Please collect the amount "+amount);
        }else{
            System.out.println("Insufficient Balance ");
        }
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.println(amount+" deposited in your account");
    }

    public double checkBalance(){
        return this.balance;
    }

}
