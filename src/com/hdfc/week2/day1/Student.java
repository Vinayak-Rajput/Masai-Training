package com.hdfc.week2.day1;

public class Student {
    private int sNo;
    private String name;
    private int age;

    public Student(){

    }

    public Student(int sNo, String name, int age) {
        this.sNo = sNo;
        this.name = name;
        this.age = age;
    }

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sNo=" + sNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
