package com.company;

public class LinSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,52,4,2,4,13,42,4,23,4,3, 4, 5, 6, 7, 8, 9};
        int target= 3;
        int ind = LinearSearch(arr,target);
        System.out.println("index value is " + ind);
        int ele = LinearSearch2(arr,target);
        System.out.println("element value " + ele);
        boolean str= LinearSearch3(arr, target);
        System.out.println(str);
    }

    //search the target and return the true and false
    static boolean LinearSearch3(int[] arr, int target){
        if(arr.length== 0){
            return false;

        }
        for (int index = 0; index < arr.length; index++ ){
            if(target == arr[index]){
                return true;
            }
        }
        // this line will execute if nothing to have found the target element from the given array
        // and will retrun the value -1
        return false;

    }

    //return the element value
    static int LinearSearch2(int[] arr, int target){
        if(arr.length== 0){
            return -1;

        }
        for (int element : arr){
            if(element==target){
                return element;
            }
        }
        // this line will execute if nothing to have found the target element from the given array
        // and will retrun the value -1
        return -1;

    }

    //return the index value if the target element will found with in the given array
    //if not the it will return -1 value

     static int LinearSearch(int[] arr, int target){
        if(arr.length== 0){
            return -1;

        }
            for (int index = 0; index < arr.length; index++ ){
                if(target == arr[index]){
                    return index;
                }
            }
            // this line will execute if nothing to have found the target element from the given array
         // and will retrun the value -1
         return -1;

    }

}
