package com.company;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args){
        String name= "Shubham";
        char target1= 'S';
        char target2 = 'z';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name, target1));
        System.out.println( search2(name, target2));

    }
    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch: str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i=0; i< str.length();i++){
            if(target == str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
}
