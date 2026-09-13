package com.hdfc.ThreadImplementation;

public class BDemo {
    static void main() {
        Thread b = new B();

        System.out.println("Start of main().");

        b.start();

        System.out.println("End of main().");

    }
}
