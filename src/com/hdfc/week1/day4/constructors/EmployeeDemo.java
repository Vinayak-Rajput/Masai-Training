package com.hdfc.week1.day4.constructors;

import java.util.Scanner;

public class EmployeeDemo {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employees: ");
        int numEmp = sc.nextInt();

        Employee[] employees = new Employee[numEmp];

        for(int i=0;i < numEmp ;i++){

            System.out.println("Enter Data of employee "+ (i+1) +" in (roll,name,salary) form: ");

            if(i==0) sc.nextLine();

            String entry = sc.nextLine();

            String[] data = entry.split(",");

            employees[i] = new Employee(Integer.parseInt(data[0].trim()),data[1].trim(),Double.parseDouble(data[2].trim()));
        }

        new Employee().printDetails(employees);
    }
}
