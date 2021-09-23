package com.company;

public class PracticeSet {
    public static void main(String[] args) {
        
    }
}
/*
// sum a series of numbers
// example n=5
// then sum is 5+4+3+2+!+0 = 15
public class PracticeSet {
    public static void main(String[] args) {
        System.out.println(sumSeries(1000));

    }
    static int sumSeries(int n) {
        if (n < 1) {
            return 0;
        }
        return n + sumSeries(n - 1);
    }
}
*/
// Fibonacci Numer   0 1 1 2 3 5 8 13 ,,,,
/*
public class PracticeSet {
    public static void main(String[] args) {
        System.out.println("Fibonacci Number is " + fibonacciNumber(7));
    }
    static int fibonacciNumber(int n){
        if(n <2){
            return n;
        }
        return (fibonacciNumber(n-1) + fibonacciNumber(n-2));
    }
}

 */
/*
// factorial Number
public class PracticeSet {
    public static void main(String[] args) {
        System.out.println(factorial(100));
    }
    public static double factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));  //tail recursion ( final return )

        }
    }
}

 */
/*
public class PracticeSet {
    static int count =0;
    public static void main(String[] args) {
        // finite number  hello print
     printhello();

    }
    static void printhello(){
        count++;
        if(count<=5){
            System.out.println("Hello " + count);
            printhello();
        }

    }
}


 */