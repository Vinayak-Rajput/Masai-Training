package com.hdfc.ThreadImplementation;

public class ADemo {
    static void main() {
        A a = new A();

        Thread thread = new Thread(a);
        System.out.println("Start of main().");

        thread.start();

        System.out.println("End of main().");

    }
}
