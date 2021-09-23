package com.company;

import java.util.Arrays;

// find first positive missing number
public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4,1,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int index=0;
        while (index<arr.length){
            int correct = arr[index]-1;
            if(arr[index] >0 && arr[index] <arr.length && arr[index]!= arr[correct]){
                swap(arr,index, correct);
            }
            else{
                index++;
            }
        }
        // find the first miising positive number
        for (int i=0; i<arr.length;i++){
            if(arr[i] != i+1){
                System.out.println("Missing positive number:" + (i+1));
                return;
            }
        }
    }
    public static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}

/*
// find pairs in a given array to reach the target
public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr= {2,7,4,6,6,9};
        int target = 15;
        arraygroup(arr,target);


    }
    public static void arraygroup(int[] arr, int target){
        Arrays.sort(arr);
        int index = 0;
        while (index <arr.length){
            int second = target - arr[index];
            for(int i=index;i<arr.length;i++){
                if( second == arr[i]){
                    System.out.println("Pair found " + "("+ arr[index] + "," + arr[i] + ")");
                    return;
                }
            }
            index++;
        }
        System.out.println("Pair not found ");

    }
}

 */
/*
// find mismatch
public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,4,4,3,6,5,6,6,8};
        System.out.println("Input: " + arr);
        mismatch(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(mismatch(arr));
    }
    public static List<Integer> mismatch(int[] arr) {
        int i = 0;
        while ((i< arr.length)){
            int correct = arr[i]-1;
            if(arr[i] <= arr.length && arr[i]!= arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        // return the duplicates
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < arr.length;index++){
            int correct= arr[index]-1;
            if(arr[index] != index+1 &&  arr[correct] == arr[index]){
                    ans.add(arr[index]);
                    ans.add(index+1);
                }
        }
        return ans;

    }
    public static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }

}


 */
/*
// find all the duplicates in the given array
public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,3,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(sort(arr));
    }
    public static List<Integer> sort(int[] arr) {
        int i = 0;
        while ((i< arr.length)){
            int correct = arr[i]-1;
            if(arr[i] <= arr.length && arr[i]!= arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }

        // return the duplicates
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < arr.length;index++){
            int correct= arr[index]-1;
            if(arr[index] != index+1){
                if(arr[correct] == arr[index]){
                    ans.add(arr[index]);
                }
            }
        }
        return ans;
    }
    public static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}

 */
/*
//find out the first most duplicate number
public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr = {5,5,5,2,3,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(sort(arr));
    }
    public static int sort(int[] arr){
        int i= 0;
        while(i<arr.length){
            if(arr[i] != i+1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);

                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;

    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;

    }
}

 */
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
