package com.hdfc.week2.day2;

import java.util.ArrayList;
public class TreeSetDemo {


    static void main() {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Vinayak",10,21));
        students.add(new Student("Rohit",12,22));
        students.add(new Student("Shiva",30,18));
        students.add(new Student("Ravi",4,16));

        students.sort((s1, s2) -> CharSequence.compare(s1.getName(), s2.getName()));

        for(Student student: students){
            System.out.println(student);
        }

    }
}
