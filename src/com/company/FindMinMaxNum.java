package com.company;

public class FindMinMaxNum {
    public static void main(String[] args){
        int[] arr = {12,-32,4,2,333,32,134,1,31,4,223};
        System.out.println("Minimum value " + findmin(arr));
        System.out.println("Maximum value " + findmax(arr));
    }
    static int findmin( int[] arr){
        if (arr.length == 0){
            return -1;
        }
        //if array is not null
        //return the min value in the given array
        int ansmin = arr[0];
        // for min valur
        for(int i=0;i<arr.length;i++){
            if(arr[i]< ansmin){
                ansmin=arr[i];
            };
        }
        return ansmin;

    }
    static int findmax( int[] arr){
        if (arr.length == 0){
            return -1;
        }
        //if array is not null
        //return the min value in the given array
        int ansmax = arr[0];
        // for min valur
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ansmax){
                ansmax=arr[i];
            };
        }
        return ansmax;

    }
}
