package com.Arrays.Medium;

public class Q53 {
    public int maxSubArray(int[] nums) {
        int curr_sum=0,max_sum=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            curr_sum += nums[i];

            if (curr_sum < 0) {
                curr_sum = 0;
            }

            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
        }
        return max_sum;
    }
}
