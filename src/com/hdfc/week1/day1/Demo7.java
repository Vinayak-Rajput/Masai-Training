package com.hdfc.week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo7 {
    static void testValue(int x){
         if(x%5==0 && x%3==0) System.out.println("Hello");
         else if(x%5==0) System.out.println("Welcome");
         else if(x%3==0) System.out.println("Hello World");
         else System.out.println("Invalid number");
    }
    static void main() throws IOException {
         BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
         int num=Integer.parseInt(String.valueOf(bf.read()));

         testValue(3);
         testValue(5);
         testValue(23);
         testValue(15);
    }
}
