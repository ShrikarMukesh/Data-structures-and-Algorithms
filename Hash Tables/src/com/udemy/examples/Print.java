package com.udemy.examples;

public class Print {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        for( j=0;j<10;j++);
        System.out.println(j);  
        print(i);
    }
    public static void print(int i){
        if(i>9){
            return;
        }
        System.out.println(i);
        i++;
        print(i);
        return;
    }
}
