package com.example.functional.Student;

import java.util.Comparator;

public class StudentsNameComp implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s2.getName().charAt(0) > s1.getName().charAt(0) ? -1 : 1;
    }
}
