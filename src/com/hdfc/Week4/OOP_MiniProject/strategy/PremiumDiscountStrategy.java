package com.hdfc.Week4.OOP_MiniProject.strategy;

public class PremiumDiscountStrategy implements DiscountStrategy {

    private double discountRate = 0.20;

    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice * (1 - discountRate);
    }
}
