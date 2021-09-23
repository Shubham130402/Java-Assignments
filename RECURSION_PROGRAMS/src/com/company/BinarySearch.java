package com.company;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums= {2,3,21,455,8,4,24};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int target = 21;
        System.out.println(search(nums,target,0, nums.length-1));
    }
    public static int search(int[] arr, int target, int start, int end) {
        if(start > end){
            return -1;
        }
        int m= start + (end-start)/2;
        if(arr[m] == target){
            return m;
        }
        if(arr[m]<target){
            return search(arr,target,m+1,end);
        }
        if(arr[m]>target){
            return search(arr,target,start,m-1);
        }
        return -1;
    }
}
