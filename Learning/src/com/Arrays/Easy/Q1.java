package com.Arrays.Easy;
import java.util.*;

public class Q1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> table=new HashMap<>();
        for(int i=0;i< nums.length;i++){
            table.put(nums[i],i );
        }
        for(int i=0;i< nums.length;i++) {
            int k=table.getOrDefault(target-nums[i],-1);
            if (k!=-1 && k!=i)
                return new int[]{i, k};
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4},6)));
    }
}
