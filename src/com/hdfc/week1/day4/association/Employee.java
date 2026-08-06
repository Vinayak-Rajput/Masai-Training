package com.hdfc.week1.day4.association;

public class Employee {
    private String empId;
    private String empName;
    private double salary;

    private Address address=new Address();

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public void displayEmployeeDetails(){

        System.out.println("--------------------------");
        System.out.println("Employee ID: "+empId);
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Salary: "+salary);

        System.out.print("Employee Address: ");
        System.out.print("State - "+this.address.getState());
        System.out.print(" | City - "+this.address.getCity());
        System.out.println(" | PinCode - "+this.address.getPinCode());
    }
}
