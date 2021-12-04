package com.company;

import java.util.Arrays;

public class Main{
public static void main(String[]args){
    int[] arr = {1,2,3,4,5,786,34,9};
    int[] ar=  mergesort(arr);
    System.out.println(Arrays.toString(ar));
    }
    public static int[] mergesort(int[] arr){
    if(arr.length==1){
        return arr;
    }

    int mid = arr.length /2 ;
    int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
    int[] right = mergesort(Arrays.copyOfRange(arr, mid , arr.length));
    return merge(left,right);
    }
    private static int[] merge(int[] first, int[] last) {
        int[] mix = new int[first.length + last.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < last.length) {
            if (first[i] > last[j]) {
                mix[k] = last[j];
                j++;
            }
            else if (first[i] < last[j])  {
                mix[k] = first[i];
                i++;
            }
            k++;
        }
        // it may be possible that one of the arrays is not complete, then add them as it is in the final array (mix)
        while(i< first.length){
            mix[k]= first[i];
            i++;
            k++;
        }

        while(j< last.length){
            mix[k]= last[j];
            j++;
            k++;
        }
        return mix;
    }
}