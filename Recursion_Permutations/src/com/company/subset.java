package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {

        // subseq("", "abc");
        // System.out.println(subseq("","abcd"));
        // subseq("", "abc");
        System.out.println(subseqASCIIret("","abc"));
    }
    /*
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
         char ch = up.charAt(0);
        subseq(p, up.substring(1));
        subseq(p+ch, up.substring(1));
    }

  */
    /*

    static ArrayList<String> subseq(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseq(p, up.substring(1));
        ArrayList<String> right =  subseq(p+(ch+0), up.substring(1));
        right.addAll(left);
        return right;
    }


     */
    /*
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p, up.substring(1));
        subseq(p+ch, up.substring(1));
        subseq(p+(ch+0), up.substring(1));
    }

     */

    static ArrayList<String> subseqASCIIret(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqASCIIret(p, up.substring(1));
        ArrayList<String> second =  subseqASCIIret(p+(ch+0), up.substring(1));
        ArrayList<String> third =  subseqASCIIret(p+(ch+0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
