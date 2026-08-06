package com.hdfc.week2.day3;

import java.util.*;

public class HashMapDemo {
    List<String> removeDuplicates(List<String> original){

        HashMap<String,Integer> hmap =new HashMap<>();

        ArrayList<String> ans =new ArrayList<>();

        for(String str: original){

            hmap.put(str,hmap.getOrDefault(str,0)+1);
        }

        for(Map.Entry<String,Integer> me : hmap.entrySet()){

            ans.add(me.getKey());
        }

        return ans;

    }
    static void main() {
        System.out.println(new HashMapDemo().removeDuplicates(Arrays.asList(new String[]{"Delhi","Bangalore","Delhi","Bangalore"})));
    }
}
