package com.company;

public class OrderAgnosticBinSearch {
    public static void main(String[] args){
        int[] arr = {2,20,30,3,40,4,50,5,100,6,60,7,70}; // sorted array with ascending order
        int target = 6;
        int ans = agnosticBinSearch(arr, target);
        System.out.println(ans);

    }
    static int agnosticBinSearch(int[] arr, int target){
        int start= 0;
        int end = arr.length -1;
        // find whether the array is sorted in ascnding or descending order
        boolean isAsc = arr[start]<arr[end];

        /* boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc = false;
        } */

        while(start<=end){
            //find the middle element
            // int mid = (start + end)/2;  //example (1+8)/2 = 4.5 = 4
            // might be possible (start + end) will exceed the range of integer
            int mid= start + (end-start)/2; // example 1 + (8-1)/2 = 1+3.5 = 4.5 = 4
            if( arr[mid]== target){

                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;

                }
            }
            else {
                if (target > arr[mid]) {
                   end = mid-1;

                } else {
                    start = mid + 1;

                }

            }

        }
        return -1;

    }
    }
