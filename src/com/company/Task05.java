package com.company;

public class Task05 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 2, 4, 5, 6};
        int n = arr.length;
        n = removeDuplicate(arr, n);
        //print the modified array after removing the duplicates
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");

        }

    }

    static int removeDuplicate(int[] arr, int n) {
        // return if array is empty or if array contsins only 1 element
        if (n == 0 || n == 1) {
            return n;

        }else {
            int[] temp = new int[n];
            int j = 0;
            for (int i = 0; i < n-1; i++) {
                if (arr[i] != arr[i + 1]) {
                    temp[j++] = arr[i];
                }

            }
            for (int i = 0; i < j; i++) {
                arr[i] = temp[i];
            }
            return j;
        }
    }
}