package com.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1389 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int result[]=new int[nums.length];

//        Using Arrays.
//

//        for(int i=0;i< nums.length;i++){
//            result[i]=-1;
//        }
//
//        for(int i=0;i< nums.length;i++){
//            int idx=index[i];
//            if(result[idx]==-1)
//                result[idx]=nums[i];
//            else {
//                int temp=result[idx];
//                result[idx]=nums[i];
//                while(idx< nums.length-1){
//                    int temp2=result[++idx];
//                    result[idx]=temp;
//                    temp=temp2;
//                }
//            }
//        }

//        Using linkedList.
        ArrayList<Integer> tempResult=new ArrayList<>();
        for(int i=0;i< nums.length;i++){
            tempResult.add(index[i],nums[i]);
        }
        for(int i=0;i<tempResult.size();i++){
            result[i]=tempResult.get(i);
        }
        System.gc();
        return result;
    }

    public static void main(String[] args) {
        int[] point={0,1,2,3,4};
        int[] index ={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(point,index)));
    }
}
