package com.example.functional;

@FunctionalInterface
public interface Add {
    int add(int n1,int n2);
    String toString();
}

/* Allowed methods in a functional interface
default methods
static methods
private instance methods
private static methods
Methods from object class
 */

// Comparable, Comparator, Runnable, Iterable -> Some of the important functional interfaces