package com.company;

public class NumbersExample {
    public static void main(String[] args) {
        //Write a function to print that takes a numbers and print it
        // print 1 2 3 4
        print1(1);
    }
    static void print1(int n ){
        System.out.println(1);
        print2(2);
    }
    static void print2(int n ){
        System.out.println(2);
        print3(3);
    }
    static void print3(int n ){
        System.out.println(3);
        print4(4);
    }static void print4(int n ){
        System.out.println(4);
    }
}