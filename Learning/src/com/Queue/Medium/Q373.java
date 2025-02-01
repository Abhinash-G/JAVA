package com.Queue.Medium;

import java.util.*;

public class Q373 {

    class Type{
        Integer sum;
        List<Integer> indexs;
        Type(){}
        Type(Integer sum,List<Integer> indexs){
            this.sum=sum;
            this.indexs=indexs;
        }
    }
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Type> heap=new PriorityQueue<>((a,b)->a.sum-b.sum);
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                heap.add(new Type(nums1[i]+nums2[j],new ArrayList<>(List.of(nums1[1],nums2[j])) ));
            }
        }
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<k;i++)
            result.add(heap.poll().indexs);
        return result;
    }

    //Faster.
    class Solution {
        public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
            PriorityQueue<int[]> minHeap=new PriorityQueue<>((a,b)->(a[0]+a[1])-(b[0]+b[1]));

            for(int i=0;i<nums1.length && i<k;i++)
            {
                minHeap.add(new int[]{nums1[i],nums2[0],0});
            }

            List<List<Integer>> result=new ArrayList<>();

            for(int i=0; i<k && !minHeap.isEmpty();i++)
            {
                int[] curr=minHeap.poll();
                result.add(List.of(curr[0],curr[1]));
                int nums2Idx=curr[2];
                if(nums2Idx<nums2.length-1)
                {
                    minHeap.add(new int[]{curr[0],nums2[nums2Idx+1],nums2Idx+1});
                }
            }


            return result;
        }
    }
}
