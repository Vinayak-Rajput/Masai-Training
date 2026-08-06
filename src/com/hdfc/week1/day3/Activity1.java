package com.hdfc.week1.day3;


import java.util.Scanner;

public class Activity1 {

    int getTotalMarks(int[] marks){

        int totalMarks = 0;

        for(int i=0;i<marks.length;i++){

            totalMarks+=marks[i];
        }
        return totalMarks;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks: ");
        int noOfMarks = sc.nextInt();

        int[] marks = new int[noOfMarks];

        for(int i=0;i<marks.length;i++){

            System.out.println("Enter Marks: ");
            marks[i]=sc.nextInt();
        }

        int result = new Activity1().getTotalMarks(marks);
        System.out.println("Total Marks: "+result);
    }

}
