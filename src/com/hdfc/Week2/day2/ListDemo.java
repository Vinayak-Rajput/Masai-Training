package com.hdfc.week2.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class ListDemo {
     public List<String> removeDuplicate(List<String> original) {
        return new ArrayList<>(new LinkedHashSet<>(original));
     }

    static void main() {
        System.out.println(new ListDemo().removeDuplicate(Arrays.asList(new String[]{"Delhi","Bareilly","Cities","Bengaluru","Delhi","Citites"})));
    }
}
