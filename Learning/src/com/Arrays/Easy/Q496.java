package com.Arrays.Easy;

import java.util.ArrayList;
import java.util.Hashtable;

/*
The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
 */
public class Q496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result=new int[nums1.length];
        Hashtable<Integer,Integer> table=new Hashtable<>();
        for (int i=0;i< nums2.length;i++){
            table.put(nums2[i],i);
        }
        for(int i=0;i< nums1.length;i++){
            int ans=-1,index=table.get(nums1[i]);
            while(++index<nums2.length){
                if(nums1[i]<nums2[index]){
                    ans=nums2[index];
                    break;
                }
            }
            result[i]=ans;
        }

        return result;
    }
}
