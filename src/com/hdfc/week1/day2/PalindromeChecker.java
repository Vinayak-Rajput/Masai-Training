package com.hdfc.week1.day2;

import java.util.Scanner;

public class PalindromeChecker {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int ogNum = num;

        int reversedNumber=0;
        while(num>0){
            int lastDigit = num%10;
            reversedNumber=reversedNumber*10+lastDigit;
            num=num/10;
        }

        if(reversedNumber==ogNum) System.out.println("Number is a Palindrome");
        else System.out.println("Number is not a Palindrome");
    }
}
