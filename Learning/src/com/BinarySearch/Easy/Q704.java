package com.BinarySearch.Easy;

public class Q704 {
    public static int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                right=mid-1;
            else
                left=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(search(new int[]{},1));
    }
}
