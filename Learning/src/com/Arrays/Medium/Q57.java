package com.Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0)
            return new int[][]{newInterval};
        if(intervals[intervals.length-1][1]<newInterval[0]){
            int[][] result=new int[intervals.length+1][2];
            int c=-1;
            for(int[] i:intervals)
                result[++c]=i;
            result[intervals.length]=newInterval;
            return result;
        }
        if(newInterval[1]<intervals[0][0]){
            int[][] result=new int[intervals.length+1][2];
            int c=0;
            result[0]=newInterval;
            for(int[] i:intervals)
                result[++c]=i;
            return result;
        }
        List<int[]> merged = new ArrayList<>();


        int i=0;
        while(i<intervals.length){
            if(newInterval[0]>intervals[i][1])
                merged.add(intervals[i]);
            else {
                if (newInterval[1] < intervals[i][0]) {
                    merged.add(newInterval);
                    merged.add(intervals[i]);
                    break;
                }
                int start = Math.min(newInterval[0], intervals[i][0]);
                int value = newInterval[1];
                while (i < intervals.length && intervals[i][0] <= value) {
                    value = Math.max(intervals[i][1], value);
                    ++i;
                }
                merged.add(new int[]{start, Math.max(value, intervals[--i][1])});
                break;
            }
            ++i;
        }
        while(++i<intervals.length) {
            merged.add(intervals[i]);
        }
        int[][] mergedArray = new int[merged.size()][2];
        for ( i = 0; i < merged.size(); i++ ) {
            mergedArray[i] = merged.get(i);
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        Q57 on=new Q57();
        int[][] input={{1,2},{4,5},{8,10}};

//        int[][] result=on.insert(input,new int[]{2,3});
        int[][] result=on.insert(input,new int[]{2,6});
//        int[][] result=on.insert(input,new int[]{6,7});
//        int[][] result=on.insert(input,new int[]{3,5});
//        int[][] result=on.insert(input,new int[]{4,6});
//        int[][] result=on.insert(input,new int[]{8,9});
        for(int[] t:result){
            System.out.print(Arrays.toString(t));
        }
    }
}
