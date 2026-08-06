package com.hdfc.week1.day3.abstract_classes.activity2;

public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(int empId, String name) {
        super(empId, name);
    }

    @Override
    double calculateSalary() {
        return 2000;
    }
}
