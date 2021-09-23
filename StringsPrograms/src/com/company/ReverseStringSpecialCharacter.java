package com.company;

import java.util.Arrays;
//LeatCode Problem Solutions
public class ReverseStringSpecialCharacter {
    public static void main(String[] args) {
        String s = "ab-cd--e-d";
        System.out.println(s);
        s= reverseOnlyLetters(s);
        System.out.println(s);
    }

    public static String reverseOnlyLetters(String s) {
        char[] charArray = s.toCharArray();
        int l = 0;
        int r = charArray.length - 1;
        while (l < r) {
            //ignore special characters
            if (!Character.isAlphabetic(charArray[l])) {
                l++;
            } else if (!Character.isAlphabetic(charArray[r])) {
                r--;
            }
            //both charAray[l] and charArray[r] are not special
            else {
                char temp = charArray[l];
                charArray[l] = charArray[r];
                charArray[r] = temp;
                l++;
                r--;
            }
        }
        return String.copyValueOf(charArray);
    }
}