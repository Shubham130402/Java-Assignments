package com.company;
import java.util.Scanner;

public class Task01{
    public static void main (String[] args){
        int[][] mat= new int[3][3];
        int i,j;
        int c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for Matrix:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++){
                mat[i][j]= sc.nextInt();
                if(mat[i][j]==0){
                    c ++;

                }


            }
        }
        System.out.println("Entered Matrix:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++){
                System.out.print(mat[i][j] + " ");

            }
            System.out.println();

        }
        //check matrix is sparse or not (matrix is 3X3)
        if(c>4.5){
            System.out.println("entered matrix is a sparse matrix");
        }
        else{
            System.out.println("entered matrix is not a sparse matrix");
        }



        }

        }