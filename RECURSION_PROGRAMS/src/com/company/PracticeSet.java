package com.company;
import java.util.Arrays;

// Conversion Programs and Bitwise operators
public class PracticeSet {
    public static void main(String[] args) {
        // find XOR of numbers from o to a

    }
}
/*
public class PracticeSet {
    public static void main(String[] args) {
        //Given a number n , find the no of set bits in it.
        int n= 8;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setbits(n));
        /*
        int n =1000;
        int p = 0;
        int N=0;
        while (n>0){
            if((n&1)==0){
                p++;

            }
            else{
                N++;
            }
            n=n>>1;
        }
        System.out.println(N);
        System.out.println(p);

         // end comment
    }
    public static int setbits(int n){
        int count = 0;
        while(n>0){
            count++;
            n = (n& (n-1));
        }
        return count;
    }
}
*/
/*
public class PracticeSet {
    public static void main(String[] args) {
        // output of the any of the power of the base
        int power = 0;
        int ans = 1;
        int base = -3;

        while(power>0){
            if((power&1) ==1){
                ans = ans*base;
            }
            base *= base;
            power = power >>1;
        }
        System.out.println(ans);


    }
}

 */
/*
public class PracticeSet {
    public static void main(String[] args) {
        // find the sum of the nth row in pascal triangle
        int j = 5; // row number
        System.out.println(Math.pow(2,j-1));

        // you are given a number if it is pwer of 2 or not
        int i = 16;
        boolean ans;
        for (int n = 0; n <= i; n++) {
            ans = ((n & (n - 1)) == 0);
            System.out.println(ans);
        }
    }

    }

 */

/*
public class PracticeSet {
    public static void main(String[] args) {
        // Msgic Number 5 ki powers
        int n =4;
        int ans = 0;
        int base =5;
        while(n>0){
            int last = n&1;
            n = n>>1;
            ans += last*base ;
            base = base*5;

        }
        System.out.println(ans);
    }
}

 */
/*
//binary to decimal conversion program
public class PracticeSet {
    public static void main(String[] args) {
        int binary = 11110110;
        System.out.println(getdecimal(binary));
    }
    public static int getdecimal(int n) {
        int decimal =0;
        int p =0 ;
        while (true) {
            if (n == 0) {
                break;
            } else {
                int temp = n%10;
                decimal+= temp*Math.pow(2,p);
                n=n/10;
                p++;
            }
        }
        return decimal;
    }
}

 */
/*

public class PracticeSet {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 2, 3, 4};
        int decNum = 10;

        //decimal to binary conversion
        StringBuilder sb = new StringBuilder();
        while(decNum !=0){
            int num = decNum%2;
            sb.append(num);
            decNum = decNum/2;
        }
        System.out.println("the Output " + sb);
        System.out.println("the binary conversion of is : "+ sb.reverse());
        System.out.println(sb.toString());
        System.out.println(Arrays.toString(sb.codePoints().toArray()));
        //binary to decimal conversion
        String  binary = "10101010";
        int decimal = Integer.parseInt(binary,2);
        System.out.println(decimal);


    }
}

 */
// palindrome
/*
public class PracticeSet {
    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        int rev = 0;
        int num =x;
        while (num!=0){
            int y= rev*10 + num%10;
            if((y-num%10)/10 != rev){
                return false;
            }
            else{
                rev = y;
            }
            num= num/10;
        }
        if(x == rev){
            return true;
        }
        return false;
    }
    }

 */
/*

public class PracticeSet {
    public static void main(String[] args) {
        int x= -0;
        System.out.println(reverse(x));
    }
    public static int reverse(int x){
        int rev = 0;
        while (x!=0){
            int y = rev*10 + x%10;
            if((y-x%10)/10 != rev){
                return 0;
            }
            else{
                rev = y;
            }
            x= x/10;
        }
        return rev;
    }

}

 */
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