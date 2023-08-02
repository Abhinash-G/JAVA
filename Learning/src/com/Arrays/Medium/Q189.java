package com.Arrays.Medium;

import java.util.Arrays;

public class Q189 {
    public static void rotate(int[] nums, int k) {
        int len= nums.length;
        {
//        for(int i=1;i<=k;i++){
//            int temp=nums[len-1];
//            for(int j=len-2;j>=0;j--){
//                nums[j]=nums[j+1];
//            }
//            nums[0]=temp;
//        }
        }
        reverse(nums,0,len-1);
        reverse(nums, 0, (k % len)-1);
        reverse(nums, k%len, len - 1);
    }
    static void reverse(int[] nums,int start, int end){
        for(int i=start;i<=end;i++){
            int temp=nums[i];
            nums[i]=nums[end];
            nums[end]=temp;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] n={1,2,3,4,5,6,7};
        rotate(n,9);
        System.out.println(Arrays.toString(n));
    }
}
