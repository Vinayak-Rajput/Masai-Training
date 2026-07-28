package com.main.assignments;

import java.util.Scanner;

public class ReverseTheNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        int reversedNumber=0;
        while(num>0){
            int lastDigit = num%10;
            reversedNumber=reversedNumber*10+lastDigit;
            num=num/10;
        }

        System.out.println("Reverse of the number: "+ reversedNumber);
    }
}
