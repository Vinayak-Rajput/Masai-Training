package com.hdfc.day3.activity2;

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
}