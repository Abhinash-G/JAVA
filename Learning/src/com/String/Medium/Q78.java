package com.String.Medium;

import java.util.*;

public class Q78 {
//    public List<List<Integer>> subsets(int[] nums) {
//        if(nums.length==1){
//            return new ArrayList<>(List.of(new ArrayList<>(), new ArrayList<>(List.of(nums[0]))));
//        }
//        List<List<Integer>> result=new ArrayList<>(List.of(new ArrayList<>()));
//        HashMap<Integer,ArrayList<ArrayList<Integer>>> map=new HashMap<>();
//        for(int i=nums.length-1;i>=0;i--){
//            ArrayList<ArrayList<Integer>> bigBox=new ArrayList<>(List.of(new ArrayList<>(List.of(nums[i]))));
//            for(int j=i+1;i<nums.length;j++){
//                ArrayList<ArrayList<Integer>> preElement=map.get(nums[j]);
//                for(int k=0;k<preElement.size();k++) {
//                    ArrayList<Integer> list=new ArrayList<>(preElement.get(k));
//                    list.add(nums[i]);
//                    bigBox.add(list);
//                }
//            }
//            map.put(nums[i],bigBox);
//        }
//        for(ArrayList<ArrayList<Integer>> outList: map.values()){
//            for(ArrayList<Integer> list:outList)
//                result.add(list);
//        }
//        return result;
//    }

    public List<List<Integer>> subsets(int[] nums) {
        if(nums.length==1)
            return new ArrayList<>(List.of(new ArrayList<>(), new ArrayList<>(List.of(nums[0]))));
        else{
            int current=nums[0];
            List<List<Integer>> preElement=subsets(Arrays.copyOfRange(nums,1,nums.length));
            List<List<Integer>> result=new ArrayList<>(preElement);
            for(int k=0;k<preElement.size();k++) {
                ArrayList<Integer> list=new ArrayList<>(preElement.get(k));
                list.add(current);
                result.add(list);
            }
            return result;
        }
    }
}
