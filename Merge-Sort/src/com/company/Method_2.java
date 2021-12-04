package com.company;

import java.util.Arrays;

public class Method_2 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,56,3,57,3,89,9};
        mergesortinplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergesortinplace(int[] arr, int s, int e){
        if(e-s ==1){
            return ;
        }
        int mid = (s+e) /2;
         mergesortinplace(arr,s,mid);
         mergesortinplace(arr,mid, e);
         mergeinplace(arr,s,mid,e);
     }
     private static void mergeinplace(int[] arr, int s,int m,int e){
        int[] mix = new int[e-s];
        int k =0;
        int i=s;
        int j=m;

        while(i< m && j<e){
            if(arr[i]<arr[j]){
                mix[k]= arr[i];
                i++;
            }
            else{
                mix[k]= arr[j];
                j++;
            }
            k++;
        }

        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for(int l =0;l< mix.length;l++){
            arr[s+l]= mix[l];
        }

     }

 }
