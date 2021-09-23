package com.company;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String str = "Shubham Agarwal";
        System.out.println(str.toCharArray());
        System.out.println(Arrays.toString(str.toCharArray()));

        System.out.println(str);
        System.out.println(str.indexOf('h'));
        System.out.println("  kunal    ".strip());
        System.out.println(Arrays.toString(str.split("hub")));
       // System.out.println(str);
    }
}
