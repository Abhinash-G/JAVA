package com.Arrays.Hard;

import java.util.HashSet;

public class Q41 {
    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> table=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            table.add(nums[i]);
        }
        int i=1;
        while (true){
            if(!table.contains(i))
                return i;
            i++;
        }
    }

//    public int firstMissingPositive(int[] nums) {
//        int n=nums.length;
//        int ans=n+1;
//        int x[]=new int[n+1];
//        for(int i=0;i<n;i++)
//        {
//            if(nums[i]>0 && nums[i]<=n)
//                x[nums[i]]=1;
//        }
//        for(int i=1;i<x.length;i++)
//        {
//            if(x[i]==0)
//            {
//                ans = i;
//                break;
//            }
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{5,6,987,1,4}));
    }
}
