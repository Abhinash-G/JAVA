package com.DP.Easy;

import java.util.Arrays;

public class Q746 {
    public static int minCostClimbingStairs(int[] cost) {
        if(cost.length==2)
            return Math.min(cost[1],cost[0]);
        int[] result=new int[cost.length];
        result[cost.length-1]=cost[cost.length-1];
        result[cost.length-2]=cost[cost.length-2];
        for(int i=result.length-3;i>=0;i--){
            result[i]=Math.min(result[i+1],result[i+2])+cost[i];
        }
        System.out.println(Arrays.toString(result));
        return Math.min(result[0],result[1]);
    }

    public static void main(String[] args) {
        System.out.println(Q746.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }
}
