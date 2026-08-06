package com.hdfc.day3.abstract_classes.activity3;

abstract class BankAccount {

    String accNo;

    public BankAccount(String accNo) {
        this.accNo = accNo;
    }

    abstract void withdraw();

}
