package com.hdfc.day5.animals;

public class Tiger extends Animal {

    @Override
    public void eat(){
        System.out.println("Tiger is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Tiger is sleeping");
    }

    @Override
    public void makeNoise(){
        System.out.println("Tiger is roaring");
    }
}
