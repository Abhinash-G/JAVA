package com.Arrays.Easy;

import java.util.Arrays;

public class Q2441 {
    public static int findMaxK(int[] nums) {
        if(nums.length==1)
            return -1;
        Arrays.sort(nums);

//        int lastNegative=0;
//        for(int i:nums){
//            if(i<0)
//                lastNegative++;
//            else break;
//        }

        int negativePointer=0,positivePointer= nums.length-1;
        while(negativePointer<positivePointer){
            if((-nums[negativePointer])<nums[positivePointer]){
                positivePointer--;
            }
            else if((-nums[negativePointer])>nums[positivePointer]){
                negativePointer++;
            }
            else{
                return nums[positivePointer];
            }
        }
        return -1;
    }

//Naive but faster to execute on small data.

//    public int findMaxK(int[] nums) {
//        int result = -1,maxVal = 0;
//        for(int num: nums) {
//            if(num > 0 && num > maxVal && checkNegExists(nums, -1*num)) {
//                maxVal = num;
//                result = maxVal;
//            }
//        }
//        return result;
//    }
//
//    public boolean checkNegExists(int[] nums, int k) {
//        for(int num: nums) {
//            if(k == num) {
//                return true;
//            }
//        }
//        return false;
//    }


    public static void main(String[] args) {
        System.out.println(Q2441.findMaxK(new int[]{22,34,2,44,-8,49,-5,22,46,39,-23,-15,27,48,-37,10,22,-45,13,-2}));
    }
}
