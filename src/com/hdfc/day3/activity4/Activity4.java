package com.hdfc.day3.activity4;

import java.util.Scanner;

public class Activity4 {
    public void calculateStatistics(Student[] students){

        new Student().getHighestMarksStudent(students);
        new Student().getAvgMarks(students);
    }

    public void searchStudent(Student[] students, int roll){
        boolean found =false;

        for(Student stu: students){
            if(stu.getRoll() == roll){
                System.out.println("Student Found:");
                System.out.println("Name: " + stu.getName());
                System.out.println("Marks: " + stu.getMarks());
                found = true;
                break;
            }
        }
        if(!found) System.out.println("Student not found");
    }

    static void main() {
        Student[] students = new Student[3];
        students[0]=new Student(101,"Vinayak",20) ;
        students[1]=new Student(101,"Vinayak",20) ;
        students[2]=new Student(101,"Vinayak",20) ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number to search: ");
        int r = sc.nextInt();
        new Activity4().searchStudent(students, r);


        new Activity4().calculateStatistics(students);
    }
}
