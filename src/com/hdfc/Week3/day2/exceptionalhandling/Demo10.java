package com.example.exceptionalhandling;

public class Demo10 {
    public static void main(String[] args) {
        for(int i=0;i<2;i++){
            try{
                break;
            }
            catch(Exception e) {
                System.out.println("Catch");
            }
            finally{
                System.out.println("Finally");
            }
        }
    }
}
