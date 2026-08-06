package com.hdfc.day1;

import java.util.Scanner;

public class Demo6 {
    static void main() {
         Scanner sc = new Scanner(System.in);
         String storedUserName = "hdfc";
         String storedPassword = "hdfc@1234";

         System.out.println("Enter UserCredentials");
         String userName=sc.next();
         String password=sc.next();

         if(storedUserName.equals(userName) && storedPassword.equals(password)){
             System.out.println("User is valid");
         }else{
             System.out.println("Either Username or Password is wrong");
         }
         sc.close();
    }
}
