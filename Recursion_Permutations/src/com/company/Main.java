package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // skip("", "abccad");  // for not returning  anything
        // System.out.println(skip("abaccda"));  //returning  String
        // System.out.println(skipapple("appledfg")); // skip string part
        System.out.println(skipAppnotapple("abcapplebhr"));
    }
    public static String skipAppnotapple(String up) {
        if (up.isEmpty()) {
            return " ";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppnotapple(up.substring(3));
        }
        else{
            return up.charAt(0) + skipAppnotapple(up.substring(1));
        }
    }
/*
    public static String skipapple(String up){
        if(up.isEmpty()){
            return " ";
        }
        if(up.startsWith("apple")){
            return skipapple(up.substring(5));
        }
        else{
            return up.charAt(0)  + skipapple(up.substring(1));
        }
    }

 */
    /*
    //returning the string from this method
    static String skip ( String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a') {
            return skip(up.substring(1));
        }
        else {
            return ch+ skip(up.substring(1));
        }
    }

     */

   /*
// not returning anything from this method
    // skip the character from the string which we required
    static void skip (String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='b'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch, up.substring(1));
        }
    }

    */
}
