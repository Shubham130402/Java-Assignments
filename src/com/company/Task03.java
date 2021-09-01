package com.company;
import java.util.Scanner;
public class Task03 {
    public static void main(String[] args){
        //WAP  for matrix multtiplication and matrix additions

        //initialization the array and variables

        int matA[][] = new int[3][3];
        int matB[][] = new int[3][3];
        int matC[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for 1st matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matA[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the values for 2nd matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matB[i][j]= sc.nextInt();
            }
        }
        System.out.println("Print the matrixes");
        for(int[] i:matA){
            for(int j:i){
                System.out.print(matA[j] + " ");
            }
            System.out.println();
        }
        for(int[] i:matB){
            for(int j:i){
                System.out.print(matB[j] + " ");
            }
            System.out.println();
        }


        /* int c[][]= new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
               ;
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j] + "");
            }
            System.out.println();
        }

         */

    }
}
