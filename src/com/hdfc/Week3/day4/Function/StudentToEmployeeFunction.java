package com.example.functional.FISpecifics;

import com.example.functional.Student.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class StudentToEmployeeFunction {
    static void main() {
        Function<Student,Employee> studentEmployeeConverter = (s) -> {

            Supplier<Employee> supplierOfEmployees = Employee::new;

            Employee newEmployee = supplierOfEmployees.get();

            newEmployee.setName(s.getName());
            newEmployee.setEmpId(s.getRoll());
            newEmployee.setPerformanceScore(s.getMarks());

            return newEmployee;

        };

        System.out.println(studentEmployeeConverter.apply(new Student(101,"Vinayak",900)));

    }
}
