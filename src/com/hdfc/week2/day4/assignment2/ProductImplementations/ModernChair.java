package com.hdfc.week2.day4.assignment2.ProductImplementations;

import com.hdfc.week2.day4.assignment2.ProductInterfaces.Chair;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sit on a Modern Chair");
    }
}
