package com.hdfc.day5.Inheritance;

public class A {

    private String name;
    private String age;

    A(String name,String age){
        System.out.println("Inside the constructor of class A");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void funA(){
        System.out.println("Inside funA() of A class");
    }


    public void showDetails(){
        System.out.println("Child's Properties:");
        System.out.println("Name: "+ this.name);
        System.out.println("Age: "+ this.age);

    }

}
