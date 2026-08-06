package com.hdfc.week1.day2;

import java.util.Scanner;

public class Assignment4 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Day Name: ");
        String day = sc.next();

        String activity= switch(day){
            case "Monday" -> "Java";
            case "Tuesday" -> "Python";
            case "Wednesday" -> "DBMS";
            case "Thursday" -> "OS";
            case "Friday" -> "Revision";
            case "Saturday" -> "Sleep";
            case "Sunday" -> "Sleep";
            default -> "Invalid Day Entered: Couldn't fetch";
        };

        System.out.print("Your Planned Learning Activity is "+ activity);
    }
}
