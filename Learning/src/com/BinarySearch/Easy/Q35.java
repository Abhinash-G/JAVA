package com.BinarySearch.Easy;

public class Q35 {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==1)
            return (nums[0]>=target)?0:1;
        int head=0,tail= nums.length-1,mid=0;
        while(head<=tail){
            mid=(head+tail)/2;
            if(nums[mid]==target)
                break;
            else if(nums[mid]>target)
                tail=mid-1;
            else
                head=mid+1;
        }
        return (nums[mid]==target)?mid:(nums[mid]<target)?mid+1:mid-1;
    }
}
