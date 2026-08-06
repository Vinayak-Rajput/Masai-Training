package com.hdfc.week1.day3.abstract_classes.activity2;

public class Demo {
    static void main() {

        Employee e1 = new FullTimeEmployee(101,"Vinayak");

        e1.printInfo();

        System.out.println(e1.calculateSalary());

        Employee e2 = new PartTimeEmployee(102,"Ravi");

        e1.printInfo();

        System.out.println(e1.calculateSalary());


    }
}
