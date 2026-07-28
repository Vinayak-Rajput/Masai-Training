package com.main.assignments;

import java.util.Scanner;

public class Assignment2 {
    static void main() {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Marks: ");
        int marks = sc.nextInt();

        System.out.println("Your Grade: ");
        switch(marks){
            case 100,99,98,97,96,95,94,93,92,91,90: {
                System.out.println("A");
                break;
            }
            case 89,88,87,86,85,84,83,82,81,80,79,78,77,76,75: {
                System.out.println("B");
                break;
            }
            case 74,73,72,71,70,69,68,67,66,65,64,63,62,61,60: {
                System.out.println("C");
                break;
            }
            default:
                System.out.println("Fail");
        }
    }
}
