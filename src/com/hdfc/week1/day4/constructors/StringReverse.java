package com.hdfc.week1.day4.constructors;

public class StringReverse {
    public String reverse(String str){
        char[] charArray = str.toCharArray();

        int low=0, high=charArray.length-1;

        while(low<=high){
            char ch=charArray[low];
            charArray[low]=charArray[high];
            charArray[high]=ch;
            low++;high--;
        }
        return new String(charArray);
    }

    static void main() {
        //long startTime =System.currentTimeMillis();

        System.out.println("Original String: " + "Hello");
        System.out.println("Reversed String: " + new StringReverse().reverse("Hello"));

        //long endTime = System.currentTimeMillis();

        //System.out.println(endTime - startTime);
    }
}
