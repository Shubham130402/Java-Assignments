package com.company;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        //Leet Code Problem
     // jova code to illustrate how to revrse an array without affecting the special characters
        String str = "Shubham";
        char[] charArray = str.toCharArray();

        System.out.println("Input string: " +str);
        reverse(charArray);
        String revstr = new String(charArray);
        System.out.println("Output String: " +revstr);
    }
    public static void reverse(char[] charArray){
        //Initializing the left and right pointers
        int r = charArray.length -1 ;
        int l=0;
        //traverse string from both ends until 'l' and 'r'
        while(l<r){
            //ignore special characters
            if(!Character.isAlphabetic(charArray[l])){
                l++;
            }
            else if(!Character.isAlphabetic(charArray[r])){
                r--;
            }
            //both charAray[l] and charArray[r] are not special
            else{
                char temp = charArray[l];
                charArray[l] = charArray[r];
                charArray[r] = temp;
                l++;
                r--;
            }

         }
    }
}
