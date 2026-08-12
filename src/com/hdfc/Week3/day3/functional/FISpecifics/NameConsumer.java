package com.example.functional.FISpecifics;

import java.util.Locale;
import java.util.function.Consumer;

public class NameConsumer implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println("Welcome "+ s.toUpperCase());

    }
}
