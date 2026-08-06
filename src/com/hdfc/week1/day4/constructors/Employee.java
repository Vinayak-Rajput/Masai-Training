package com.hdfc.week1.day4.constructors;

public class Employee {
    private int empId;
    private String empName;
    private double salary;

    public Employee(){
    }

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printDetails(Employee[] employees){

        System.out.println("\nEmployee Details: ");
        System.out.println("---------------------------");

        for(Employee emp: employees) {
            System.out.println("Id: "+ emp.getEmpId());
            System.out.println("Name: " + emp.getEmpName());
            System.out.println("Salary: "+emp.getSalary());
            System.out.println("---------------------------");
        }
    }
}
