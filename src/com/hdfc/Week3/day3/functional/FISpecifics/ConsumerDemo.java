package com.example.functional.FISpecifics;

import com.example.functional.MethodRef.A;
import com.example.functional.Student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerDemo{
    static void main() {
        Consumer<String>  c1 = new NameConsumer();
        c1.accept("Vinayak");

        Consumer<String> c2 = s -> System.out.println("Hello "+ s.toUpperCase());
        c2.accept("Ravi");

        Consumer<String> c3 = A::greet;
        c3.accept("Jack");

        Consumer<String> c4 = System.out::println;
        c4.accept("Parul is newer addition to team.");


        Consumer<Student> c5 = System.out::println;
        c5.accept(new Student(10,"Haider",900));

        Consumer<String> c6 = c3.andThen(c2);
        c6.accept("Caterine");

        List<String> cities = new ArrayList<>(List.of("Delhi","Mumbai","Bangalore","Cheenai","Kolkata"));

        cities.forEach(System.out::println);

        cities.forEach(city -> System.out.println(city.toUpperCase() + " is Awesome!"));

    }
}
