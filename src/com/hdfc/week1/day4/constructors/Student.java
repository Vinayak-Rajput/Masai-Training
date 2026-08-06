package com.hdfc.week1.day4.constructors;

public class Student {
    private String sName;
    private int rollNo;
    private double marks;

    public Student(){
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void printDetails(Student[] students){
        if(students == null){
            System.out.println("No Student Data Exist");
            return;
        }
        System.out.println("\nStudent Details");
        System.out.println("-------------------------------------------------");

        for(Student student: students) {
            System.out.println("RollNo: " + student.getRollNo() + " | Name: " + student.getsName() + " | Marks: " + student.getMarks());
            System.out.println("-------------------------------------------------");
        }
    }

    public Student getHighestMarksStudent(Student[] students){

        if(students == null) {
            System.out.println("No student data found");
            return new Student();
        }

        int max =0;
        Student student = null;
        for(Student stud: students){
            if(max < stud.getMarks()){
                student = stud;
            }
        }

        return student;
    }
}
