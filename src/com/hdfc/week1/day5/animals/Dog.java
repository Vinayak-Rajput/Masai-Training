package com.hdfc.week1.day5.animals;

public class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Dog is sleeping");
    }

    @Override
    public void makeNoise(){
        System.out.println("Dog is barking");
    }

    public void handShake(){
        System.out.println("Dog is shaking hand");
    }

}
