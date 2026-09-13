package com.hdfc.strategy;

public class FestivalDiscountStrategy implements DiscountStrategy {

    private double discountRate = 0.10;

    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice * (1 - discountRate);
    }
}
