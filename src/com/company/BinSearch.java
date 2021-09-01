package com.company;

public class BinSearch {
    public static void main(String[] args){
        int[] arr = {-12,-23,2,3,4,5,6,7,89,100}; // sorted array with ascending order
                int target = 6;
                int ans = BInarySearch(arr, target);
        System.out.println(ans);

    }
    //return the index
    //return -1 if does not exist
    static int BInarySearch(int[] arr, int target){
        int start= 0;
        int end = arr.length -1;

        while(start<=end){
        //find the middle element
        // int mid = (start + end)/2;  //example (1+8)/2 = 4.5 = 4
        // might be possible (start + end) will exceed the range of integer
             int mid= start + (end-start)/2; // example 1 + (8-1)/2 = 1+3.5 = 4.5 = 4
            if (target < arr[mid])
            {
                end= mid - 1;

            }
            else if (target <arr[mid]){
                start= mid+1;

            }
            else {
                return mid;
            }

            }
        return -1;

        }
    }

