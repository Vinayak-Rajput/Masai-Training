package com.hdfc.week2.day1;

public class DynamicArray {
    private int[] arr;
    private int size;

    public DynamicArray(){
        arr = new int[5];
        size = 0;
    }

    public void add(int data){

        if(size == arr.length){
            System.out.println("Array is full, increasing capacity from " + arr.length +" to "+ (arr.length *2));
        }

        int[] newArr = new int[arr.length *2];

        for(int i=0;i< size;i++){
            newArr[i]= arr[i];
        }

        arr = newArr;
    }

    public void remove(int index){

        if(index >=size || index == 0){
            throw new IndexOutOfBoundsException("Index out of bound");
        }

        for(int i=index; index < size -1;i++){
            arr[i] =arr[i+1];
        }

        size--;
    }

    public int get(int index){

        if(index >=size || index <0){

            throw new IndexOutOfBoundsException("Index out of bound");
        }

        return arr[index];
    }

    public int size(){

        return size;
    }

    public int capacity(){
        return arr.length;
    }

    public void clear(){
        size =0;
    }

    public void display(){
        for(int i=0;i< size;i++){
            System.out.println(arr[i]+ " ");

        }
        System.out.println();
    }
}
