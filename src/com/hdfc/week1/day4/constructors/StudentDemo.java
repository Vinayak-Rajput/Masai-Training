package com.hdfc.week1.day4.constructors;

import java.util.Scanner;

public class StudentDemo {
    static void main() {

        Student[] students;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int numStudents = sc.nextInt();

        students = new Student[numStudents];

        System.out.println("\nEnter Details of "+ numStudents + " Students: \n");
        for(int i = 0;i < numStudents; i++){

            students[i]=new Student();

            System.out.println("Student "+ (i+1));

            System.out.println("Enter Student Roll No: ");
            students[i].setRollNo(sc.nextInt());

            sc.nextLine();
            System.out.println("Enter Student Name: ");
            students[i].setsName(sc.nextLine());

            System.out.println("Enter Student Marks: ");
            students[i].setMarks(sc.nextDouble());

            System.out.println();
        }

        new Student().printDetails(students);
    }
}
