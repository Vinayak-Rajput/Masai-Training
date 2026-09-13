package com.hdfc.Week4.Smart_ECommerce_Order_Management_System.strategy;

public class FestivalDiscountStrategy
        implements DiscountStrategy {

    @Override
    public double applyDiscount(double amount) {

        return amount * 0.90;
    }
}