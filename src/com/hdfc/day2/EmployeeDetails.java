package com.hdfc.day2;

import java.util.Scanner;

public class EmployeeDetails {

    static void main() {
        int empId;
        String empName;
        double salary;

        Scanner sc=new Scanner(System.in);

        int choice = 1;
        while(choice==1){
            System.out.println("Enter Employee Details: ");

            System.out.println("Enter Employy ID: ");
            empId=sc.nextInt();

            System.out.println("Enter Employee Name: ");
            empName=sc.next();

            System.out.println("Enter Salary: ");
            salary=sc.nextInt();

            System.out.println("\nEmployee Details Entered:\n");
            System.out.println("Employee ID: "+empId +"\nEmployee Name: "+empName+"\nSalary: "+salary);

            System.out.println("\nDo you wish to continue? Enter 1 to continue...");
            choice=sc.nextInt();
        }

    }
}
