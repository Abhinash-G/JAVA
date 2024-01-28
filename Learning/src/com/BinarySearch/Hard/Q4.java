package com.BinarySearch.Hard;

public class Q4 {
//    Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//The overall run time complexity should be O(log (m+n)).
    private int[] merged(int[] nums1,int[] num2){
        int length=nums1.length+ num2.length;
        int[] merged=new int[length];
        int i=0;
        while(i<length/2+1){

        }
        return merged;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged=merged(nums1,nums2);
        if(merged.length%2==0)
            return (double)0.0;
        return 0.0d;
    }
}
