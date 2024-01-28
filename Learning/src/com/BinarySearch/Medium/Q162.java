package com.BinarySearch.Medium;

public class Q162 {
    
    public static int findPeakElement(int[] nums) {
        if(nums.length==1)
            return 0;
        int min=1,max= nums.length-2;
        if(nums[0]>nums[1])
            return 0;
        else if(nums[max]<nums[max+1])
            return max+1;
        while(min<=max){
            int mid=min+(max-min)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
                return mid;
            else if(nums[mid]<nums[mid-1])
                max=mid-1;
            else
                min=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{6,5,4,3,2,3,2}));
    }
}
