package com.Arrays.Medium;


public class Q34 {
    private int lowerbound(int[] nums , int target){
        int low = 0 ;
        int high = nums.length -1;
        int ans = -1;
        while( low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target ){
                ans = mid;
                high = mid -1 ;
            }
            else if(nums[mid] > target )
                high = mid - 1;
            else
                low = mid +1 ;
        }
        return ans;
    }

    private int higherbound(int[] nums , int target){
        int low = 0 ;
        int high = nums.length - 1 ;
        int ans = -1 ;
        while(low <= high){
            int mid = (low +high )/2 ;
            if(nums[mid] == target ){
                ans = mid ;
                low = mid + 1 ;

            }
            else if(nums[mid] > target)
                high = mid -1 ;
            else
                low = mid + 1 ;
        }
        return ans ;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = lowerbound(nums, target);
        result[1]  = higherbound(nums,target);
        return result;
    }
}
