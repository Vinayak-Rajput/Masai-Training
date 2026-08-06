package com.hdfc.day3.abstract_classes.activity2;

abstract class Employee {
    private int empId;
    private String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public final void printInfo() {
        System.out.println("Employee ID: " + this.empId + "Name: " + this.name);
    }

    abstract double calculateSalary();

}
