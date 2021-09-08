package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Cyclicsort {
    public static void main(String[] args) {

    }
}
/*
// find the missing number
public class Cyclicsort {
    public static void main(String[] args){
        int[] arr= {4,3,2,7,8,2,3,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(sort(arr));

    }
        public static List<Integer> sort(int[] arr) {
            int i = 0;
            while(i<arr.length) {
                int correct = arr[i]-1;
                if (arr[i] <= arr.length  && arr[i] != arr[correct]) {
                    swap(arr,i,correct);

                }
                else {
                    i++;
                }
            }
            //find missing numbers
            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index <arr.length;index++){
                if(arr[index] != index +1){
                    ans.add(index + 1);
                }
            }
            return ans;
        }

    public  static void swap(int[ ] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;

    }
    }

 */
/*
// Missing number
public class Cyclicsort {
    public static void main(String[] args){
        int[] arr= {4,3,1,5,9,8,6,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(sort(arr));
    }

     public static int sort(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            int correct = arr[i]-1;
            if (arr[i] < arr.length  && arr[i] != arr[correct]) {
                swap(arr,i,correct);

            }
            else {
                i++;
            }
        }
        //searching the first missing number
         for(int j=0;j< arr.length;j++){
             if(arr[j] != j+1){
                 return j+1;
             }
         }
         return -1;
    }
    public  static void swap(int[ ] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;

    }

}

 */

/*
// Cyclic Sorting Algorithm
    // in the [0-N] or [1-N] like problem and numbers are unique.
    // sorting with comparison by indexes

    public static void main(String[] args) {
        int[] arr = {2, 3,1,0,5,4}; // in [0-4] array
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort ( int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] != arr[correct]) {
                cyclicsort(arr, i, correct);
            } else {
                i++;
            }
        }

    }
    public static void cyclicsort(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}

 */
