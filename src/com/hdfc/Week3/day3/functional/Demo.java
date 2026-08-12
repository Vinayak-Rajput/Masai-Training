package com.example.functional;

public class Demo {
    static void main() {
        Add a1 = new Add(){
            @Override
            public int add(int n1,int n2){
                return n1+n2;
            }
        };
        System.out.println(a1.add(10,20));

        Add a2 = (n1,n2)-> n1+n2;
        System.out.println(a2.add(10,20));

        Add a3 = Integer::sum;
        System.out.println(a3.add(10,20));
        

    }

}
