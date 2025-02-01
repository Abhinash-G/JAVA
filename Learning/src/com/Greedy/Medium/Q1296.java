package com.Greedy.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class Q1296 {
    public boolean isPossibleDivide(int[] nums, int k) {
        HashMap<Integer,Integer> mapOfFrequency=new HashMap<>();
        for(int i:nums)
            mapOfFrequency.put(i,(mapOfFrequency.getOrDefault(i,0)+1));
        int[] values=mapOfFrequency.keySet().stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(values);

        return true;
    }
}
