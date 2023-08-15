package com.BinarySearch.Medium;

public class Q153 {
    public static int findMin(int[] nums) {
        int min=0,max= nums.length-1;
        while(min<=max){
            int mid=(min+max)/2;
            if(nums[mid]<nums[min])
                max=mid;
            else if(nums[mid]>nums[max])
                min=mid+1;
            else {
                return nums[min];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,1,2}));
        System.out.println(findMin(new int[]{3,4,5,1,2}));
        System.out.println(findMin(new int[]{3,4,5,1,2}));
    }
}
