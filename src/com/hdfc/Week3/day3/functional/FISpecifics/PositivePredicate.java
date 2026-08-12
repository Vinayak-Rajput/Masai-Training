package com.example.functional.FISpecifics;

import java.util.function.Predicate;

public class PositivePredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return integer >= 0;
    }
}
