package com.example.functional.FISpecifics;

import com.example.functional.Student.Student;

import java.util.*;
import java.util.function.Predicate;

public class PredicateDemo {

    static void main() {
        Predicate<Integer> p1 =new PositivePredicate();
        System.out.println(p1.test(-20));
        System.out.println(p1.test(40));

        Predicate<Integer> p2 = i -> i >= 0;
        System.out.println(p2.test(20));
        System.out.println(p2.test(-90));

        Predicate<String> p3 = s -> s.contains("@");

        List<Student> students = new ArrayList<Student>(Arrays.asList(
                new Student[]{
                        new Student(100, "Vinayak", 500),
                        null,
                        new Student(101, "Ravi", 450),
                        new Student(102, "Jay", 380),
                        new Student(103, "David", 300),
                        null,
                        new Student(104, "Jamil", 480)
                }
        ));

        System.out.println("\nBefore Removal: ");
        for(Student student : students){
            System.out.println(student);
        }

        students.removeIf(Objects::isNull);

        System.out.println("\nAfter Removal: ");

        for(Student student : students){
            System.out.println(student);
        }

    }
}
