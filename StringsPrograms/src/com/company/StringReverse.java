package com.company;
import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        char[] s={'s','h','b','h','a','m'};
        System.out.println(s);
        printreverse(s);

    }
    public static void printreverse(char[] s) {
        int n = s.length;
        if (n == 0) {
            System.out.println("Character array is empty");
        } else {
            String str = "";
            for (int i = n - 1; i >= 0; i--) {
                str = str + s[i];
            }
            System.out.print(Arrays.toString(str.toCharArray()));
        }
    }
    }


/*
// reverse string program by String parameter method
public class StringReverse {
    public static void main(String[] args) {
        String str = "Reverse";
        // String is immutable
        str= reverse(str);
        System.out.println("The reverse String is: "+ str);
    }
    public static String reverse(String str){
        if (str == null || str.equals(" ")){
            return str;
        }
        int n = str.length(); //char[] temp = new char[n];

        // reverse the string backward
        for(int i=0;i<n;i++){
            temp[n-i-1] = str.charAt(i);
        } get the length of the string
        //create a character array of the same size of the string

        //convert character array to string and return it
        return String.copyValueOf(temp);

    }
}

 */
/*
// first string reverse technique
public class StringReverse {
    public static void main(String[] args) {
        String str1 = "Shubham";
        System.out.println(Arrays.toString(str1.toCharArray()));
        String str2 ="";
        for(int i= str1.length()-1;i>=0;i--){
            char ch =str1.charAt(i);
            str2= str2+ ch;
        }
        System.out.println(str2);
        System.out.println(Arrays.toString(str2.toCharArray()));
    }
}


 */