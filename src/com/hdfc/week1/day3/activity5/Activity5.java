package com.hdfc.week1.day3.activity5;

import java.util.Scanner;

public class Activity5 {
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

    Student[] getStudents(String userName, String password){

        if(userName.equals("admin")){
            if(password.equals("password")){
                System.out.println("Credentials Verified");
                Student[] students = new Student[3];
                students[0]=new Student(101,"Vinayak",20) ;
                students[1]=new Student(102,"Ravi",28) ;
                students[2]=new Student(103,"Sanjay",30) ;
                return students;
            }else{
                System.out.println("Wrong Password");
            }
        }else{
            System.out.println("Username Invalid");
        }
        return null;
    }

    static void main() {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number to search: ");
        int r = sc.nextInt();

    }
}
