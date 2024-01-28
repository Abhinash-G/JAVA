package com.Arrays.Medium;

import java.lang.reflect.Array;

public class Q45 {
    public int jump(int[] nums) {
        if(nums.length==1)
            return 0;
        int[] dp=new int[nums.length];
        dp[nums.length-1]=0;
        for(int i= nums.length-2;i>=0;i++){
            if(nums[i]==0)
                dp[i]=Integer.MAX_VALUE;
            if(nums[i]>=(nums.length-1-i))
                dp[i]=1;
            else{
                int maxValue=nums[i],min=Integer.MAX_VALUE;
                while(maxValue>0){
                    min=Math.min(min,dp[i - --maxValue]);
                }
                dp[i]=min;
            }
        }
        return dp[0];
    }
}
