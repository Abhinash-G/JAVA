package com.Arrays.Medium;

import java.util.*;

public class Q347 {
//    Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int result[]=new int[k];
        for(int i:nums)
            freq.put(i,freq.getOrDefault(i,0)+1);
        //with in-build Sorting.
        {
//            LinkedList<Map.Entry<Integer, Integer>> sort = new LinkedList<>(freq.entrySet());
//            sort.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
//            System.out.println(sort);
//            for (int i = 0; i < k; i++)
//                result[i] = sort.get(i).getKey();
//            return result;
        }
        //Faster approach.
        {
//            Map<Integer, Integer> map = new HashMap<>();
//            for (int n : nums)
//                map.put(n, map.getOrDefault(n, 0) + 1);
//
//            PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
//
//            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//                maxHeap.add(entry);
//                if (maxHeap.size() > k) {
//                    maxHeap.poll();
//                }
//            }
//
//            int[] res = new int[k];
//            int index = 0;
//            while (!maxHeap.isEmpty()) {
//                res[index++] = maxHeap.poll().getKey();
//            }
//
//            return res;
        }
        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for(Map.Entry<Integer,Integer> node: freq.entrySet()) {
            heap.add(node);
        }
        System.out.println(heap);
        for (int i = 0; i < k; i++)
                result[i] = heap.poll().getKey();
            return result;
    }

    public static void main(String[] args) {
        int[] p=topKFrequent(new int[]{1,5,9,9,4,5,2,3,9,7,3},3);
        for(int i:p)
            System.out.println(i);
    }
}
