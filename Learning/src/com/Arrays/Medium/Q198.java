package com.Arrays.Medium;

public class Q198 {
    public static int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
            return nums[0];
        else if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        int dp[]=new int[n];
        dp[n-1]=nums[n-1];
        dp[n-2]=nums[n-2];
        dp[n-3]=nums[n-3]+dp[n-1];
        for(int i=n-4;i>=0;i--){
            dp[i]=nums[i]+Math.max(dp[i+2],dp[i+3]);
        }
        return Math.max(dp[0],dp[1]);
    }

    public static void main(String[] args) {

    }
}
