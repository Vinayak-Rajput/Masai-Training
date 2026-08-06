package com.hdfc.week1.day3.abstract_classes.activity1;

public class Circle extends Shape{
    private final double PI = 3.14;
    private double rad;

    Circle(String color,double rad){
        super("Circle",color);
        this.rad = rad;
    }
    @Override
    public double calculateArea() {
        return PI * rad * rad;
    }
}
