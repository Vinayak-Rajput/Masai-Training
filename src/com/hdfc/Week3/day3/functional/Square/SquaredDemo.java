package com.example.functional.Square;

public class SquaredDemo {
    static void main() {
        Square s1 = (num) -> num * num;

        Square s2 = new Square() {
            @Override
            public double getSquare(double val) {
                return val * val;
            }
        };

        Square s3 = new SquareImpl();

        System.out.println("Using Lambda: " + s1.getSquare(10));

        System.out.println("Using AnonymousClass: " + s2.getSquare(10));

        System.out.println("Using Class Implementation: " + s3.getSquare(10));
    }
}
