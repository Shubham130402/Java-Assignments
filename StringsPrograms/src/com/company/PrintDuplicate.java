package com.company;

import java.util.Arrays;

public class PrintDuplicate {
    public static void main(String[] args) {
        String str = "shss";
        String pqr = new String(duplicateinStrings(str));
        System.out.println(Arrays.toString(pqr.toCharArray()));

    }
    public static String duplicateinStrings(String str){
        int n = str.length();
        char[] newstr = str.toCharArray();
        String newStr = "";
        if(str.length() ==0 || str == null ){
            System.out.println("Best of luck!!");
        }
        else{
           for(int i=0;i<n-1;i++){
               for(int j= n-1;j>i;j--){
                   if(newstr[i]==newstr[j]){
                       newStr = newStr + newstr[i];
                   }
               }
           }
        }
        return newStr;
    }
}
