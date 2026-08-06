package com.hdfc.week1.day3.activity6;

public class Student {
    private int roll;
    private String name;
    private double marks;

    public Student() {

    }

    public Student(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void printDetails(Student[] students) {
        if (students == null) {
            System.out.println("No Student Data Exist");
            return;
        }
        System.out.println("\nStudent Details");
        System.out.println("-------------------------------------------------");

        for (Student student : students) {
            System.out.println("RollNo: " + student.getRoll() + " | Name: " + student.getName() + " | Marks: " + student.getMarks());
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

    double getAvgMarks(Student[] students){

        double total=0;

        for(Student stu: students){
            total+=stu.getMarks();
        }

        return total / students.length;
    }
}
