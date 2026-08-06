package com.hdfc.week1.day2;

import java.util.Scanner;

public class SumOfTotalDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the number: ");
        int num = sc.nextInt();

        int sum=0;

        while(num>0){
            int lastDigit = num%10;
            sum+=lastDigit;
            num=num/10;
        }

        System.out.println("Total Sum of Digits: " + sum);
    }
}
