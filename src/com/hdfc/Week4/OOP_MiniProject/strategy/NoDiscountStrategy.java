package com.hdfc.Week4.OOP_MiniProject.strategy;

public class NoDiscountStrategy implements DiscountStrategy {

    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice;
    }
}
