package com.Arrays.Easy;

import java.util.*;
import java.util.stream.Collectors;

public class Q349 {
        //Easy and simple solution which is slow but adjustable to changes.
        {
//    public int[] intersection(int[] nums1, int[] nums2) {
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        Set<Integer> set=new HashSet<>();
//        int pointer1=0,pointer2=0;
//        while(pointer1<nums1.length && pointer2< nums2.length){
//            if(nums1[pointer1]==nums2[pointer2]) {
//                set.add(nums1[pointer1]);
//                ++pointer1;
//                ++pointer2;
//            }
//            else if(nums1[pointer1]<nums2[pointer2])
//                ++pointer1;
//            else
//                ++pointer2;
//        }
//        return set.stream().mapToInt(i->i).toArray();
//    }
        }
        //Even slower but a step towards a faster approach.
    {
//        public int[] intersection ( int[] nums1, int[] nums2){
//        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
//        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
//        Set<Integer> answer = new HashSet<>();
//        if (set1.size() < set2.size()) {
//            for (int i : set1) {
//                if (set2.contains(i))
//                    answer.add(i);
//            }
//        } else {
//            for (int i : set2) {
//                if (set1.contains(i))
//                    answer.add(i);
//            }
//        }
//        return answer.stream().mapToInt(i -> i).toArray();
//    }
    }
    //Faster of the three;
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<nums1.length;i++){
            set.add(nums1[i]);
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums2.length;i++){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
