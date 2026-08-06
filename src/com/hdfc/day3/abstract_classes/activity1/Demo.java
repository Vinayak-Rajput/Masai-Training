package com.hdfc.day3.abstract_classes.activity1;

public class Demo {
    static void main() {
        Rectangle rec =new Rectangle("REd",80,90);
        Circle cir = new Circle("Blue",50);

        rec.showDetails();
        System.out.println(rec.calculateArea());
        cir.showDetails();
        System.out.println(cir.calculateArea());
    }
}
