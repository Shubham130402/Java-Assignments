package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr= {1,2,4,5,7,6};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quicksort(int[] arr, int low,int hi){
        if(low>=hi){
            return;
        }
        int s=low;
        int e=hi;
        int mid = s+ (e-s)/2;
        int pivot  = arr[mid];
        //if our array is already sorted then it will not swap
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }

            if(s<=e){
                //swap
                int temp = arr[s];
                arr[s]= arr[e];
                arr[e]= temp;
                s++;
                e--;
            }
            // now my pivot is at correct index, please sort two halves now
            quicksort(arr,low,e);
            quicksort(arr,s,hi);
        }
    }

}
