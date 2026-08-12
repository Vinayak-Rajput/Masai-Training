package com.example.functional.MethodRef;

import com.example.functional.Student.Student;

public class StudentIntrDemo {
    static void main() {
        StudentIntr si = Student::getName;

        Student s1= new Student(99,"Ravi",456);

        System.out.println(si.getStudentName(s1));
    }
}
