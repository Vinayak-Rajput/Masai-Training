package com.example.functional.ComparatorSorting;

import com.example.functional.Student.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparingDemo {
    static void main() {
        List<Student> students = new ArrayList<Student>(Arrays.asList(
                new Student(100, "Vinayak", 500),
                new Student(101, "Ravi", 450),
                new Student(102, "Jay", 380),
                new Student(103, "David", 300),
                new Student(104, "Jamil", 480)));

        System.out.println("Before Sorting");
        students.forEach(System.out::println);

        students.sort(Comparator.comparing(Student::getMarks));

        System.out.println("After Sorting");
        students.forEach(System.out::println);

    }
}
