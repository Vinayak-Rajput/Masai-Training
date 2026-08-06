package com.hdfc.day3.abstract_classes.activity2;

public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(int empId, String name) {
        super(empId, name);
    }

    @Override
    double calculateSalary() {
        return 5000;
    }

}
