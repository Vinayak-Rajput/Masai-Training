package com.hdfc.week1.day3.abstract_classes.activity1;

abstract class Shape {
    protected String shapeName;
    protected String color;

    Shape(String shapeName, String color){
        this.color = color;
        this.shapeName = shapeName;

    }

    final void showDetails(){
        System.out.println("Color: "+ this.color + " ShapeName: "+ this.shapeName);
    }

    public abstract double calculateArea();




}
