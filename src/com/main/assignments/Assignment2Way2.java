package com.main.assignments;

import java.util.Scanner;
import java.util.HashMap;

public class Assignment2Way2 {
    static void main() {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Marks: ");
        int marks = sc.nextInt();

        HashMap<Integer,Integer> hMap=new HashMap<>();
        for(int i=0;i<=100;i++){
            if(i>=90)hMap.put(i,1);
            else if(i>=75)hMap.put(i,2);
            else if(i>=60)hMap.put(i,3);
            else hMap.put(i,4);
        }

        System.out.println("Your Grade: ");
        switch(hMap.get(marks)){
            case 1: {
                System.out.println("A");
                break;
            }
            case 2: {
                System.out.println("B");
                break;
            }
            case 3: {
                System.out.println("C");
                break;
            }
            default:
                System.out.println("Fail");
        }
    }
}
