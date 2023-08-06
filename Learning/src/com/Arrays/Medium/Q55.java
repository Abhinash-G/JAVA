package com.Arrays.Medium;

import java.util.Arrays;

public class Q55 {

//    Slower solution DP and recursion.
{
//    public static boolean canJump ( int[] nums){
//    boolean dp[] = new boolean[nums.length];
//    return recursion(nums, 0, dp);
//}
//    private static boolean recursion ( int[] nums, int index, boolean[] dp){
//    if (index == nums.length - 1)
//        return true;
//    else if (nums[index] == 0)
//        return false;
//    else {
//        for (int i = 1; i <= nums[index]; i++) {
//            if (index + i < dp.length)
//                if (dp[index + i] == false)
//                    dp[index] = dp[index] || recursion(nums, index + i, dp);
//        }
//        return dp[index];
//    }
//}
}
    public static boolean canJump(int[] nums){
        int n= nums.length;
        boolean dp[]= new boolean[n];
        dp[n-1]=true;
        int lastTrue=n-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]>=(lastTrue-i)) {
                dp[i] = true;
                lastTrue=i;
            }
        }
        return (lastTrue==0);
    }

    public static void main(String[] args) {
    System.out.println(canJump(new int[]{3,2,2,0,4}));
    }
}
