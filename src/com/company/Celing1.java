package com.company;
import java.util.Scanner;

public class Celing1 {
    public static void main(String[] args) {

    }
}

        /* matrix multiplication
        int[][] matA = new int[2][3];
        int[][] matB = new int[3][2];
        int[][] matC = new int[2][2];
        int i,j,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Element in the Matrix A : ");
        for(i=0;i<matA.length;i++){
            for(j=0;j<matA[0].length;j++){
                 matA[i][j] = sc.nextInt();

            }
        }
        System.out.println("Enter the element of the matrix B");
        for(j=0;j<matB.length;j++){
            for(k=0;k<matB[0].length;k++){
                matB[j][k] = sc.nextInt();

            }
        }
        for(i=0;i<matA.length;i++){
            for(k=0;k<matC[0].length;k++){
                matC[i][k] = 0;
                for(j=0;j< matB.length;j++){
                    matC[i][k] = matC[i][k] + matA[i][j] * matB[j][k];

                }
            }
        }


        System.out.println("print the content of the array");
        for(i=0;i<matA.length;i++){
            for(k=0;k<matC[0].length;k++){
                System.out.print(matC[i][k] + " ");
            }
            System.out.println();
        }
    }
}

        /* odd even count in the array


        int odd = 0;
        int even = 0;
        int[] arr = {1, 2, 3, 4,3,3,2,2,22,2,2};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;

            } else {
                odd++;
            }
        }
        System.out.println("COunt the odd and even numbers");
        System.out.println("Odd is "+odd + " and even is "+ even + " in the array");
    }
}

        /* no of the occurance in the array
        int[] arr = {11,22,1,1,11,1,11,1,1,22,33,44,22,11,11,11,1};
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the element you want to search for the occurance:");
        int n = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(n ==arr[i]){
                count++;
     }
}
        System.out.println("Content of the array");
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println("No of the occurance of the "+n+" number in the array  is: " + count);


        /*
        //insert, deletion , duplicate remove an element in the array
        int[] arr = new int[60];
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter array size:");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" array elemnents:");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Content of the array ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");

        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;){
                if(arr[j]==arr[i]){
                    for(int k=j;k<n;k++){
                        arr[k]=arr[k+1];

                    }
                    n--;
                }else
                {
                    j++;
                }
            }
        }
        System.out.println("\n after removing the duplicates");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        /*
        //System.out.println("\n\n enter the position where you want to insert a new element");
        // int position = sc.nextInt();
        System.out.println("enter the value of the  element to be deleted");
        int value = sc.nextInt();

        //for(int i=n-1; i>=position;i--){
         //   arr[i+1] = arr[i];

        //
        int position=0;
        boolean found= false;

        for(int i=0; i<n;i++) {
            if (arr[i]== value){
                found = true;
                position=i;
                break;

            }
        }
        // the element to be deleted is present in the areay
        if(found){
            for(int i=position;i<n-1;i++){
                arr[i]= arr[i+1];

            }
        }
        else {
            System.out.println("Element "+value+" is not found in the array : ");

        }
        System.out.println("\n Array after the deletion the element");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        /*arr[position-1]= value;
        System.out.println("\n\n array after the insertion of the new element");
        for(int i=0;i<=n;i++){
            System.out.print(arr[i] + " ");
        }


         */


        /* merging the array
        int arrA[] = {12, 34, 24, 2, 4, 2, 4, 3};

        int arrB[] = {2, 3, 2, 4, 3, 4234, 23, 2};
        System.out.println("Print the element of the array A");
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }
        System.out.println("print the element of the array B");
        for (int i = 0; i < arrB.length; i++) {
            System.out.print(arrB[i] + " ");
        }
        int max = arrA.length + arrB.length;
        int[] merger = new int[50];
        int j=0;
        int k=0;
        int v=0;

        while (v<max){
            if(j< arrA.length){
                merger[v]= arrA[j];
                j++;
                v++;

            }
            if(k< arrB.length){
                merger[v] = arrB[k];
                k++;
                v++;

            }
        }
        System.out.println("\n\n eleements after the merging the arrays");
        for(int i=0; i< max;i++){
            System.out.print(merger[i] + " ");
        }

        System.out.println("sorted array");
        for(int i=0;i<max;i++){
            for(j=i+1;j<max;j++){
                if(merger[i]> merger[j]){
                    int t = merger[i];
                    merger[i]=merger[j];
                    merger[j]=t;

                }
            }
        }
        for(int i=0;i<max;i++){
        System.out.print(merger[i]+ " ");
        }

    }
}
       /* sorted array
        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("ENter elements of the array: ");
        for(int i=0;i<5;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("unsorted order of the array: ");
        for(int i=0; i<5;i++){
            for(int j=i+1;j<5;j++){
                if(arr[i] <arr[j]){
                    int t= arr[i];
                    arr[i]= arr[j];
                    arr[j]=t;

                }
            }
        }
        System.out.println("\n\n Sorted array of the array(increasing order):");
        for(int i =0;i<5;i++){
            System.out.println(arr[i]+ "");

        }
    }



    }
      /* int[] arr = {1,2,3,4,15,16,17,18,19};
       int target = 3;
       int ans = getCeling(arr, target);
        System.out.println(arr[ans]);
    }
    public static int getCeling(int[] arr, int target){
        int start = 0;
        int end= arr.length -1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid-1;

            }
            else if(target >arr[mid]){
                start = mid+1;
            }

        }
        return start;

    }
}


*/
