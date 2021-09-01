package com.company;

public class SearchinRange {
    public static void main(String[] args){
        int[] arr= {18,12,-7,3,14,28};
        int target = 13; //target value to search in a give index value
        int start = 1; //index value
        int end=4;  //index value

        System.out.println(LinearSearch(arr,target,start,end));

    }

    static int LinearSearch(int[] arr, int target,int start, int end){
        if(arr.length== 0){
            return -1;

        }
        for (int index = start; index <=end; index++ ){
            if(target == arr[index]){
                return index;
            }
        }
        // this line will execute if nothing to have found the target element from the given array
        // and will retrun the value -1
        return -1;

    }
}
