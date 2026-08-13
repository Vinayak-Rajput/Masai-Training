package com.example.functional.FISpecifics;

import com.example.functional.Student.Student;

import java.util.function.Supplier;

public class SupplierDemo {
    static void main() {
        Supplier<String> supplier = new MessageSupplier();
        String str = supplier.get();
        System.out.println(str);

        Supplier<String> supplier1 = () -> "Message supplied using Lambda Expression.";
        System.out.println(supplier1.get());

        Supplier<Student> supplier2 = () -> new Student(110,"Osho",890);
        System.out.println(supplier2.get());

        Supplier<Student> supplier3 = Student::new;
        System.out.println(supplier3.get());
    }
}
