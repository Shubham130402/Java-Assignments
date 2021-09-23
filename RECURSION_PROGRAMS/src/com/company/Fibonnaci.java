package com.company;

public class Fibonnaci {
    public static void main(String[] args) {
        // print fibonacci number
        // 0 1 1 2 3 5 8 13 21 34 ........

        System.out.print(fibonacci(7));

    }
    static int fibonacci(int n ){
        if(n<2){
            return n;
        }
        return (fibonacci(n-1)+ fibonacci(n-2));

    }
}
