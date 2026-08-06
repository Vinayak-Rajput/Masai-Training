package com.hdfc.day5.animals;

public class Demo {

    @Override
    public String toString(){
        return "Object of Class: " + this.getClass().getName();
    }

    public void funAnimal(Animal animal){

        if(animal == null) {
            System.out.println("No Animal object is found");
            return;
        }

        animal.makeNoise();

        if (animal.getClass().getName().equals("com.hdfc.animals.Cat")){  // animal instanceOf Cat
            Cat cat = (Cat) animal;
            cat.smile();

        } else if (animal.getClass().getName().equals("com.hdfc.animals.Dog")){ // animal instanceOf Dog
            Dog dog = (Dog) animal;
            dog.handShake();
        }

    }
    public void finalize(){
        System.out.println(this.getClass());
    }

    static void main() {
        System.out.println(new Demo());

        new Demo().funAnimal(new Cat());
        new Demo().funAnimal(new Dog());
        new Demo().funAnimal(new Tiger());
        new Demo().funAnimal(new Animal());

        Animal.foo();
        Dog.foo();

        System.gc();

    }
}
