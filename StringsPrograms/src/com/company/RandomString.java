package com.company;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        String series = " ";
        for(int i=0; i<26;i++){
            char ch = (char)('a'+i);
            series = series+ch;
        }
        System.out.println("String is :" + series);

        // create random string builder
        StringBuilder sb = new StringBuilder();
        //create an object of Random Class
        Random random = new Random();
        //specify the length of random string
        int length = 7;
        for( int i =0;i<length;i++){
            //generate random index number
            int index = random.nextInt(series.length());
            //get character specified by index from the string
            char randomChar = series.charAt(index);
            //append the character to string builder
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        System.out.println("Random Stirng : " + randomString);
    }
}
