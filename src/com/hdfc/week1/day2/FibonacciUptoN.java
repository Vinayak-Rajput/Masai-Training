package com.hdfc.week1.day2;

import java.util.Scanner;

public class FibonacciUptoN {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int num=sc.nextInt();

        int first = 0;
        int second = 1;

        if(num == 1) {
            System.out.println("0");
            return;
        }else if(num == 2){
            System.out.println("0 1");
            return;
        }

        System.out.print("0 1 ");
        for(int i=2;;i++){

            int cur = first + second;
            if(cur>num) break;
            System.out.print(cur+" ");
            first = second;
            second = cur;
        }
    }
}
