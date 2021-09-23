package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

// three sum problem leet code question
//first tried programs by using for loops
public class ThreeSum {
    public static void main(String[] args) {
     int[] nums = {-1,0,1,2,-4,-1};
     List<List<Integer>> result =  threesum(nums);
        System.out.println(result);
    }
    public static List<List<Integer>> threesum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int i=0;


            while (i<nums.length){
                for(int j=i+1; j<nums.length;j++){
                    for(int k = nums.length -1; k>j;k--){
                        if(nums[i]+nums[j]+nums[k]==0){
                            result.add(new List<Integer>() {nums[i], nums[j], nums[k]});
                        }
                    }
                }
                i++;
            }

        return result;
    }
}
 /*  int[] nums = {-1,0,1,2,-4 };
        int i=0;
        Arrays.sort(nums);
        System.out.println(Arrays .toString(nums));
        if(nums.length < 3){
            System.out.println("Length of arrays is not suitable for this three sum program");
        }
        else{
            System.out.println("continue");
            while (i<nums.length){
                for(int j=i+1; j<nums.length;j++){
                    for(int k = nums.length -1; k>j;k--){
                        if(nums[i]+nums[j]+nums[k]==0){
                            System.out.println("values are: "+nums[i] +","+nums[j]+","+nums[k]);
                        }
                    }
                }
                i++;
            }
        }

  */