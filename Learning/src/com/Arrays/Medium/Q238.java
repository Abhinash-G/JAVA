package com.Arrays.Medium;

import java.util.Arrays;

public class Q238 {
    public static int[] productExceptSelf(int[] nums) {
        int len= nums.length;
        int[] answer=new int[len];

//        O(n^2) Solution
        {
//            for(int i=0;i< nums.length;i++){
//                int product=1;
//                for(int j=0;j< nums.length;j++) {
//                    if (i != j)
//                        product *= nums[j];
//                }
//                answer[i]=product;
//            }
        }

//        O(3n) Solution.
        {
            int[] movingFromLeft=new int[len];
            movingFromLeft[0]=nums[0];
            int[] movingFromRight=new int[len];
            movingFromRight[len-1]=nums[len-1];
            for(int i=1;i< len-1;i++){
                movingFromLeft[i]=movingFromLeft[i-1]*nums[i];
//                movingFromRight[len-1-i]=movingFromRight[len-i]* nums[len-1-i];
            }
            for(int i= len-2;i>0;i--){
                movingFromRight[i]=movingFromRight[i+1]*nums[i];
            }
            answer[0]=movingFromRight[1];
            answer[len-1]=movingFromLeft[len-2];
            for(int i=1;i<len-1;i++){
                answer[i]=movingFromLeft[i-1]*movingFromRight[i+1];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));

    }
}
