package com.hdfc.day3.abstract_classes.activity1;

public class Rectangle extends Shape {

    int len, bre;

    Rectangle(String color,int len, int bre){
        super("Rectangle",color);
        this.len =len;
        this.bre =bre;

    }

    @Override
    public double calculateArea() {
        return this.len * this.bre;
    }
}
