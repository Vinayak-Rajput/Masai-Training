package com.hdfc.week1.day5.dynamic_poly;

public class Demo extends A{
    void funDemo(){
        System.out.println("Inside funDemo() of class Demo");
    }

    @Override
    public void funA(){
        System.out.println("Inside funA() of class A");
    }

    static void main() {
        A obj = new A();
        //obj.getDemo(); can't be called as parent doesnt know who has extended it or what message it has

        Demo d1 =new Demo();

        d1.funA();
        d1.funDemo();
        d1.funB();

        A a2 = new Demo();

        a2.funA(); //Will call the overridden method
        a2.funB();
        //a2.funDemo(); Even a parent class reference isn't able to call a function defined by its child
        //Signature match is done with parent class and will lead to call fot the methods that defined in parent even the overridden method but in that case priority given to the overridden definition of the method
    }
}
