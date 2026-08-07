package com.hdfc.week2.day4.assignment1.UpdatedCode.dbUtil;

public class DatabaseConfig {
    public void initiateConnection(String userName, String password){

        if(userName.equals("admin")){

            if(!password.equals("1234")){

                System.out.println("Wrong Password");
                System.out.println("Exiting");
                System.exit(0);
            }

        } else {

            System.out.println("Wrong UserName");
            System.exit(0);
        }

        System.out.println("Connecting with the DB Server");
        System.out.println("Connection completed");
    }

    public void terminateConnection(){
        System.out.println("Terminating Connection...");
    }
}
