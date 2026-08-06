package com.hdfc.day3.activity6;

import java.util.Scanner;

public class Activity6 {
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

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter number of students");
        int studentCount= sc.nextInt();


        int[][] marks = new int[studentCount][];

        for(int i=0;i<studentCount;i++) {

            System.out.println("Enter number of subject for the student "+(i+1)+" :");

            int subjectCount= sc.nextInt();

            marks[i] = new int[subjectCount];

            System.out.println("Enter marks of student "+(i+1));

            for(int j=0;j<subjectCount;j++) {

                System.out.println("Enter marks for the subject: "+(j+1));
                marks[i][j]= sc.nextInt();

            }
        }


        System.out.println("Student Marks");


        for(int i=0;i<marks.length;i++) {

            System.out.println("Student "+(i+1));

            for(int j=0;j<marks[i].length;j++) {


                System.out.println(marks[i][j]+" ");
            }

            System.out.println();


        }

        sc.close();

    }

}
