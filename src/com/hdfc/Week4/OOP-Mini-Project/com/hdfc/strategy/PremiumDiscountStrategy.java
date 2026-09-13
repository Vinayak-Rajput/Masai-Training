package com.hdfc.strategy;

public class PremiumDiscountStrategy implements DiscountStrategy {

    private double discountRate = 0.20;

    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice * (1 - discountRate);
    }
}
