package com.String.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        if(nums.length==1){
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(nums[0]);
            result.add(temp);
            return result;
        }
        HashMap<Integer,ArrayList<ArrayList<Integer>>> map=new HashMap<>();
        for(int i=nums.length-1;i>=0;i--){
            ArrayList<ArrayList<Integer>> bigBox=new ArrayList<>();

        }
    }
}
