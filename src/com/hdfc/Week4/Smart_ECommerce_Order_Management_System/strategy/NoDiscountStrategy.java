package com.hdfc.Week4.Smart_ECommerce_Order_Management_System.strategy;

public class NoDiscountStrategy
        implements DiscountStrategy {

    @Override
    public double applyDiscount(double amount) {

        return amount;
    }
}