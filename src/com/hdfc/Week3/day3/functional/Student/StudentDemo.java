package com.example.functional.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentDemo {
    static void main() {

        List<Student> students = new ArrayList<Student>(Arrays.asList(
                new Student[]{
                        new Student(100, "Vinayak", 500),
                        new Student(101, "Ravi", 450),
                        new Student(102, "Jay", 380),
                        new Student(103, "David", 300),
                        new Student(104, "Jamil", 480)
                }
        ));

        // Collections.sort(students, (s1,s2) -> s1.getMarks() > s2.getMarks() ? 1 : -1);
        // Collections.sort(students, (s1,s2)->Character.compare(s1.getName().charAt(0),s2.getName().charAt(0)));

        Collections.sort(students, (s1,s2) -> {
            int result = Double.compare(s1.getMarks(),s2.getMarks());
            if(result == 0) return Integer.compare(s1.getRoll(),s2.getRoll());
            return result;
        });

        students.sort((s1,s2) -> {
            int result = Double.compare(s1.getMarks(),s2.getMarks());
            if(result == 0) return Integer.compare(s1.getRoll(),s2.getRoll());
            return result;
        });

        // To make it descending just change the order of s2 and s1 instances inside compare() method
        // Or use Comparator.reverseOrder() -> To reverse the sorting logic

        for(Student student: students){
            System.out.println(student);
        }
    }
}
