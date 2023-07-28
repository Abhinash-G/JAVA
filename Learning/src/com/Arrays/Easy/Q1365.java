package com.Arrays.Easy;

import java.util.Arrays;

public class Q1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int count[]=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if(nums[i]>nums[j])
                    count[i]++;
            }
        }
        System.gc();
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{1,3,5,78,3,2})));
    }
}
