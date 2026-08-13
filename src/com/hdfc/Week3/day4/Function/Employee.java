package com.example.functional.FISpecifics;

public class Employee {
    private int empId;
    private String name;
    private double performanceScore;

    public Employee(int empId, String name, double performanceScore) {
        this.empId = empId;
        this.name = name;
        this.performanceScore = performanceScore;
    }

    public Employee() {

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(double performanceScore) {
        this.performanceScore = performanceScore;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", performanceScore=" + performanceScore +
                '}';
    }
}
