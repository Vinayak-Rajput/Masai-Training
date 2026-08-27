package com.hdfc.week2.day1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    static void main() {
        Scanner sc =new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        while(true){
            System.out.println("Enter SNo: ");
            int sNo = sc.nextInt();

            System.out.println("Enter Name: ");
            String name = sc.next();

            System.out.println("Enter SNo: ");
            int age = sc.nextInt();

            students.add(new Student(sNo,name,age));

            System.out.println("Want more ? ");

            if(sc.next().equalsIgnoreCase("no"))
            break;
        }
        System.out.println(students);
    }
}
