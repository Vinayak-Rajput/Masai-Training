package com.example.functional.LambdaReturnType;

public class ReturnExampleDemo {
    public InterfaceReturnExample funA(String userName, String password){
        System.out.println("inside funA() of class ReturnExampleDemo");

        if("admin".equals(userName) && "12345".equals(password)){
            //return ()->System.out.println("Inside display() of the Interface");
        }
        return null;
    }
}
