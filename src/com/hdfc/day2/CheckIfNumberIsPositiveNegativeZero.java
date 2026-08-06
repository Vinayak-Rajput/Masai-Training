package com.hdfc.day2;

import java.util.Scanner;

public class CheckIfNumberIsPositiveNegativeZero {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        if(num>0) System.out.println("Number is Positive");
        else if(num<0) System.out.println("Number is Negative");
        else System.out.println("Number is Zero");
    }
}
