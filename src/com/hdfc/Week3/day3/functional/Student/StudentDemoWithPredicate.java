package com.example.functional.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StudentDemoWithPredicate {
    static void main() {

        List<Student> students = new ArrayList<Student>(Arrays.asList(
                new Student[]{
                        new Student(100, "Vinayak", 500),
                        new Student(101, "Ravi", 650),
                        new Student(102, "Jay", 980),
                        new Student(103, "David", 300),
                        new Student(104, "Jamil", 480)
                }
        ));

        System.out.println("\nBefore Removal: ");
        for(Student student : students){
            System.out.println(student);
        }

//        Predicate<Student> removalMarksLt500 = s -> s.getMarks() < 500;
//        students.removeIf(removalMarksLt500);
//
//        System.out.println("\nAfter Removal: ");
//        for(Student student : students){
//            System.out.println(student);
//        }
//
//        Predicate<Student> removalNamesContainingI = s -> s.getName().contains("i");
//        students.removeIf(removalNamesContainingI);
//
//        System.out.println("\nAfter Removal: ");
//        for(Student student : students){
//            System.out.println(student);
//        }

        Predicate<Student> removalMarksLt500 = s -> s.getMarks() < 500;
        Predicate<Student> removalNamesContainingI = s -> s.getName().contains("i");
        students.removeIf(removalNamesContainingI.or(removalMarksLt500));

        System.out.println("\nAfter Removal: ");
        for(Student student : students){
            System.out.println(student);
        }



    }
}
