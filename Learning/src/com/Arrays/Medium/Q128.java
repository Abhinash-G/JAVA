package com.Arrays.Medium;
/*Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.*/

import java.util.HashSet;
import java.util.*;

public class Q128 {
//    public static int longestConsecutive(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int i : nums)
//            set.add(i);
//        int longest = 0;
//        for (int i : set) {
//            int con = 1;
//            if (!set.contains(i - 1)) {
//                int num=i;
//                while(set.contains(num+1)) {
//                    con++;
//                    num++;
//                }
//            }
//            longest = Math.max(longest, con);
//        }
//        return longest;
//    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        int start=nums[0],length=1,maxLength=1;
        for(int i=1;i<nums.length;i++){
            if(start+1==nums[i]){
                length++;
                start++;
            }
            else if(start==nums[i])
                continue;
            else{
                start=nums[i];
                maxLength=Math.max(maxLength,length);
                length=1;
            }
        }
        maxLength=Math.max(maxLength,length);
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{0,2,1,1}));
    }
}
