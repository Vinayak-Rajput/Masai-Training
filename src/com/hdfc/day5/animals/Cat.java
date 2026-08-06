package com.hdfc.day5.animals;

public class Cat extends Animal {

    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Cat is sleeping");
    }

    @Override
    public void makeNoise(){
        System.out.println("Cat is mewing");
    }

    public void smile(){
        System.out.println("Cat is smiling");
    }

}
