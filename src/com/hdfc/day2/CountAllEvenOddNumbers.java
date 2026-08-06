package com.hdfc.day2;

import java.util.Scanner;

public class CountAllEvenOddNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int evenCount = 0, oddCount = 0;

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        while(num>0){
            int lastDigit = num %10;
            if(lastDigit %2==0){
                evenCount++;
            }else{
                oddCount++;
            }
            num=num/10;
        }

        System.out.println("Number of Even Digits: "+evenCount);
        System.out.println("Number of Odd Digits: "+oddCount);
    }
}
