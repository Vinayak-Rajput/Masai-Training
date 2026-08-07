package com.hdfc.week2.day4.assignment1.UpdatedCode.entitites;

public class Customer {
    private String customerType;
    private double discountRate;

    public Customer(String customerType, double discountRate) {
        this.customerType = customerType;
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return this.discountRate;
    }

    public String getCustomerType(){
        return customerType;
    }
}
