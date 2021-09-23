package com.company;

import java.util.Arrays;
import java.util.List;

public class ShuffleString {
    public static void main(String[] args) {
        String str= "abcd";
        System.out.println(str);
        System.out.println(str.toCharArray());
        System.out.println(Arrays.toString(str.split("")));
        System.out.println(Arrays.toString(str.toCharArray()));
        List<String> letters = Arrays.asList(str);
        System.out.println(letters);


    }
}
