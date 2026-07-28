package com.main.assignments;

public class Assignment1 {
    static void main() {
        for(int i=1;i<=100;i++){
            if(i==70) break;
            if(i%5==0) continue;
            System.out.println(i+ " ");
        }
    }
}
