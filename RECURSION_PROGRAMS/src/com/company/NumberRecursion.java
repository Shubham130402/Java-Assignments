package com.company;

public class NumberRecursion {
    // write a function for the number recursion
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n ){
        if(n>1000){
            return;
        }
        System.out.print(n + "\t");
        print(n+1);
    }
}
