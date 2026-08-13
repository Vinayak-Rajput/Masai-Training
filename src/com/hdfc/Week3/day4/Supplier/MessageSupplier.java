package com.example.functional.FISpecifics;

import java.util.function.Supplier;

public class MessageSupplier implements Supplier<String> {
    @Override
    public String get() {
        return "Message supplied with help of an external Supplier";
    }
}
