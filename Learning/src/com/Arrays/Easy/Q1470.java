package com.Arrays.Easy;

import java.util.Arrays;

public class Q1470 {
    public static int[] shuffle(int[] nums, int n) {
        int result[]=new int[2*n];
        int k=-1;
        for(int i=0;i<n;i++){
            result[++k]=nums[i];
            result[++k]=nums[n+i];
        }
        System.gc();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{1,2},1)));
    }
}
