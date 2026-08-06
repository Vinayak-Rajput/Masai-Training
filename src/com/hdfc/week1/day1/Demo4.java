package com.hdfc.week1.day1;
import java.util.Scanner;
public class Demo4 {
    static void main() {
         System.out.println("Enter the number: ");
         int num = new Scanner(System.in).nextInt();
         for(int i=1;i<=10;i++){
             System.out.println(num + " x " + i + " = " + num*i);
         }
    }
}
