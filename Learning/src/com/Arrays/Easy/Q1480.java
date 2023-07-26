package com.Arrays.Easy;

import java.util.Arrays;

public class Q1480 {
    public static int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(runningSum(new int[]{1,2,3,4}));
        System.out.println(Arrays.toString(runningSum(new int[]{1,1,1,1,1})));
    }
}
