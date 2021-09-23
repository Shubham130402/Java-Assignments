package com.company;

import java.util.Scanner;

// Leat code Easy Problem in Easy Level
public class RotaleString {
    public static void main(String[] args) {
        String s= "abcd";
        String goal = "bcdea"; //rotate String Concept from n=2
        Scanner sc = new Scanner(System.in);
        int target  = sc.nextInt();  //number from the string will rotate and we can achieve the
        if(target < s.length()){
            String str1 = s.substring(0,target);
            String str2 = s.substring(target);
            String NewStr =   str2 + rotateString(str1,target);
            System.out.println(NewStr);
        }
        else{
            System.out.println("Please enter the target value within the range of string length");

        }

    }
    public static String rotateString(String str1,int target){
        char[] temp = new char[target];

        // reverse the string backward
        for(int i=0;i<target;i++){
            temp[target-i-1] = str1.charAt(i);
        }
        return String.copyValueOf(temp);
    }
}
