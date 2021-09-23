package com.company;

import java.util.Arrays;

public class TwoSum1 {
    public static void main(String[] args) {

        int[] nums = {0,9,1,4,2,3,80};
        int target = 6;
        int i=0;
        int j=1;
        while((i < nums.length) && ((j + 1) < nums.length)){
            if(nums[i] + nums[j+i] == target){

                break;
            }
            else if(nums[i] + nums[j+i] != target){
                j++;
                continue;
            }
            i++;
        }
        System.out.println("indexes are: " + i + "." + j);
    }
}


/*
        System.out.println(Arrays.asList(arrayList));
        int left = 0;
        int right = arrayList.length - 1;
        while (left < right) {
            if (arrayList[left] + arrayList[right] == target) {
                System.out.println("values are:" + arrayList[left] + "," + arrayList[right]);
                break;
            } else if (arrayList[left] + arrayList[right] < target) {
                left++;
            } else {
                right--;
            }
        }

 */

/*
//two pointer approach to solve two sum problem
public class TwoSum {
    public static void main(String[] args) {
        int[] arrayList = {3,2,4};
        int target =6;

        System.out.println(Arrays.asList(arrayList));
        int left =0;
        int right = arrayList.length -1;
        while(left<right){
            if(arrayList[left]+arrayList[right] ==target){
                System.out.println("values are:"+ arrayList[left] + "," + arrayList[right]);
                break;
            }
            else if(arrayList[left]+arrayList[right] < target){
                left++;
            }
            else{
                right--;
            }
        }
    }
        /*
        int[] nums = {7,3,4,8,8,10};
        int target =15;
        int[] newarr= twosum(nums,target);
        System.out.println(Arrays.asList(newarr));
    }

    public static int[] twosum(int[] nums, int target) {
        Arrays.sort(nums);
        int n= nums.length;
        int left=0;
        int right= n-1;
        while(left<right){
            if(nums[left]+nums[right] == target){
                return new int[] {left,right};
            }
            else if(nums[left]+nums[right] <target){
                left++;

        }
        else{
            right--;
            }
    }
        return new int[0];
    }


}

 */
/*
    // Two Sum Problem by using two pointer method
    //Time Complexity O(NlogN)
    int[] arrayList = {2,4,6,7,12,8};
    int target =15;
        Arrays.sort(arrayList);
                System.out.println(Arrays.asList(arrayList));
                int left =0;
                int right = arrayList.length -1;
                while(left<right){
        if(arrayList[left]+arrayList[right] ==target){
        System.out.println("values are:"+ arrayList[left] + "," + arrayList[right]);
        break;
        }
        else if(arrayList[left]+arrayList[right] < target){
        left++;
        }
        else{
        right--;
        }
        }

 */
        /*
        // Two Sum Problem by using for loop
        //Time Complexity O(N^2)
        for(int i=0;i<arrayList.length;i++){
            for(int j=i;j<arrayList.length;j++){
                if(arrayList[i]+arrayList[j] == target){
                    System.out.println("values are:"+ arrayList[i] + "," + arrayList[j]);
                }
            }
        }
*/

