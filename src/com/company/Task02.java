package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Task02{
    public static void main (String[] args){
        //Third Practice Program for 3D array
        int[][][] arr =new int[2][3][2];   //declare the 3D array

        /*
        Second program for 3D array
        int[][][] arr = null;  // array declared
        int gr=0, pr=0, ch=0;  // variable declare

        Scanner sc = new Scanner(System.in);  //create scanner class object to read input
        System.out.println("Enter the values of grandparent, parent,child for 3D array:");
        gr = sc.nextInt();
        pr= sc.nextInt();
        ch= sc.nextInt();
        //create s 3D array with given size
        arr = new int[gr][pr][ch];
        //read input value from the user
        for(int i=0;i<gr;i++){
            for(int j=0;j<pr;j++){
                for(int k=0;k<ch;k++){
                    System.out.print("element ["+i+"]["+j+"]["+k+"] is: " );
                    arr[i][j][k]= sc.nextInt();
                }
                System.out.println();
            }
            System.out.println();
        }
        //displaying the 3D array by using for-each loop
        for(int[][] i:arr){
            for(int[] j:i){
                for(int k:j){
                    System.out.print(k + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));
        sc.close(); // close the Scanner
        */

        /*
        first programm for 3D array
        //initialize the 3D array
        int[][][] arr ={{{1,2},{2,3},{3,4}},{{2,3},{3,4},{5,6}}};
        // check the length of 3D array for grand parent, parent, or child
        System.out.println("Grandparent size of array: " + arr.length);
        System.out.println("parent-1 size of array: " + arr[0].length);
        System.out.println("child-1 size of array: " + arr[0][0].length);
        //Print the array using for loop
        for(int i= 0; i<arr.length;i++){
            for(int j= 0; j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        // print the 3D array using for-each loop
        for(int[][] i:arr)
        {
            for(int[] j:i){
                for(int k:j){
                    System.out.print(k + " ");

                }
                System.out.println();
            }
            System.out.println();
        }
        // print the 3D array using Arrays.deepToString() method
        System.out.println(Arrays.deepToString(arr));
        */
        }

        }