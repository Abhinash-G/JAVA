package com.Arrays.Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Q786 {
    //Unsolved yet.
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr)
            map.put(n, map.getOrDefault(n, 0) + 1);

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.add(entry);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[] res = new int[k];
        int index = 0;
        while (!maxHeap.isEmpty()) {
            res[index++] = maxHeap.poll().getKey();
        }
        return res;
    }
}
