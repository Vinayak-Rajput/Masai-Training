package com.example.functional.FISpecifics;

import com.example.functional.Student.Student;

import java.util.function.Function;

public class FunctionDemo {
    static void main() {
        Function<String, String> fun = new UpperCaseFunction();
        System.out.println(fun.apply("Hello, Vinayak! Welcome to HDFC!"));

        Function<String, String> fun1 = String::toUpperCase;
        System.out.println(fun1.apply("It is raining outside."));

        Function<Integer,Integer> fun2 = n->n*n;
        System.out.println(fun2.apply(20));

        Function<Student,Double> fun3 = Student::getMarks;
        System.out.println(fun3.apply(new Student(100,"Ravi",678)));

        Function<Student,String> fun4 = Student::toString;
        System.out.println(fun4.apply(new Student(100,"Ravi",678)));

        Function<Student,String> fun5 = (s) -> s.getMarks() > 500 ? "PASS" : "FAIL";
        System.out.println(fun5.apply(new Student(101,"John",670)));
        System.out.println(fun5.apply(new Student(102,"Kate",344)));

        Function <Employee,Double> getScore = Employee::getPerformanceScore;
        Function <Double, Double> newScore =  score -> score * 1.5;

        System.out.println(getScore.andThen(newScore).apply(new Employee(1001,"Ravi",400)));
    }
}
