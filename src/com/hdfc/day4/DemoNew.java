package com.hdfc.day4;

public class DemoNew {
    private static final String userName = "ABCD";
    private static final String password = "pass";

    static void main() {
        new DemoNew().doAuthentication(null,"pass",new A());
        new DemoNew().doAuthentication("ABCD","pass",new A());
        new DemoNew().doAuthentication("ABCD1","pass",new A());
        new DemoNew().doAuthentication("ABCD","pass1",new A());
    }

    void doAuthentication(String enteredUserName, String enteredPassword, A obj){


        if(obj == null || enteredUserName == null || enteredPassword == null) {
            System.out.println("Please pass a valid object");

        }else{

            if(!enteredUserName.equals(userName)){
                System.out.println("Username not matched");

            }else{

                if(enteredPassword.equals(password)){

                    System.out.println("Logged in Successfully, funA() called");
                    obj.funA();

                }else{
                    System.out.println("Wrong Password entered.");
                }
            }
        }

    }
}
