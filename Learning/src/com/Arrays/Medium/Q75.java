package com.Arrays.Medium;

import java.util.Arrays;

public class Q75 {
    public static void sortColors(int[] nums) {
        int firstUnsorted=0;
        for(int i=0;i<3;i++){
            for(int j=0;j< nums.length;j++){
                if(nums[j]==i){
                    int temp=nums[firstUnsorted];
                    nums[firstUnsorted]=nums[j];
                    nums[j]=temp;
                    firstUnsorted++;
                }
            }
        }
    }

    public static void main(String[] args) {
//        int[] temp={2,0,2,1,1,0};
        int[] temp={2,1,0};
        System.out.println(Arrays.toString(temp));
        sortColors(temp);
        System.out.println(Arrays.toString(temp));
    }
}
