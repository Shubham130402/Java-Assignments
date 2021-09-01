package com.company;

import java.util.Arrays;

public class SortingProblem {
    public static void main(String[] args) {

    }
}
        /*
        int[] arr = {2,4,8,6,4,6,6,2,4245,98,9};
        for(int i=0;i< arr.length;i++) {

            // Selection sort Algorithm
            // find the maximum number from descending series in the given array and swap it with its correct index
            int last = arr.length-i-1;
            int s=9;
            int MaxIndex = getMaxIndex(arr,s ,last);

        }

    }
    public static int getMaxIndex(int[] arr,int start,int end){
        int max= start;
        for(int i= start;i<= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;

    }
}
/*
//Bubble sort Program
        // Lesson for the sorting the arrays
        //Bubble sort , Insertion sort,selection sort , merge sort
        int[] arr1 = {1,44,2,4,2,42,32,4,5,2,4,56,43,2,4,4,5667,7,79,21,3,45,643,2,4,63,10,10,20,20,20,20,30};
        bubblesort(arr1);
        bubblesort(arr1);
        System.out.println("Print the sorted array from the original array: ");
        System.out.println(Arrays.toString(arr1));

    }
    public static void bubblesort(int[] arr1) {
        // run the steps for the n-1 times
        boolean swapped;
        for (int i = 0; i < arr1.length; i++) {
            // for each step maximum item will come at the last respective index
            swapped = false;
            for (int j = 1; j < arr1.length - i; j++) {
                // swap if the size is smaller than the previous item
                if(arr1[j]< arr1[j-1]){
                    //swap
                    int temp = arr1[j];
                    arr1[j] = arr1[j-1];
                    arr1[j-1] = temp;

                    swapped =true;

                }
            }
            // if you did not swap for a particular items then it means that the given array is already dsorted
            //hencce the stop the programm
            if(!swapped){
                break;

            }
        }


    }
}

 */
