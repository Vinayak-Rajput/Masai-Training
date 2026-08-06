package com.hdfc.week1.day2;

import java.util.Scanner;

public class CountDigitsInNumber {
    static void main() {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        System.out.println("Count of Digits: "+count);
    }
}
