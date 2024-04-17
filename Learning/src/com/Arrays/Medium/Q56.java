package com.Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q56 {
    //Silly faster approach
//    public int[][] merge(int[][] intervals) {
//        int[] starts = new int[intervals.length];
//        int[] ends = new int[intervals.length];
//        for (int i = 0; i < intervals.length; i++) {
//            starts[i] = intervals[i][0];
//            ends[i] = intervals[i][1];
//        }
//        Arrays.sort(starts);
//        Arrays.sort(ends);
//        List<List<Integer>> merged = new ArrayList<>();
//        int start = starts[0], end = ends[0];
//        for (int i = 1; i < intervals.length; i++) {
//            if (starts[i] <= end) {
//                end = ends[i];
//            } else {
//                merged.add(List.of(start, end));
//                start = starts[i];
//                end = ends[i];
//            }
//        }
//        merged.add(List.of(start, end));
//        int[][] mergedArray = new int[merged.size()][2];
//        for (int i = 0; i < merged.size(); i++ ) {
//            mergedArray[i][0] = merged.get(i).get(0);
//            mergedArray[i][1] = merged.get(i).get(1);
//        }
//        return mergedArray;
//
//    }

    //Complex Approach
    public int[][] merge(int[][] intervals) {
        if(intervals.length==1)
            return intervals;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> result=new ArrayList<>();
        int pointer=0;
        while(pointer<intervals.length){
            int[] temp=new int[2];
            temp[0]=intervals[pointer][0];
            int value=intervals[pointer][1];
            int endPointer=pointer;
            while(endPointer<intervals.length && intervals[endPointer][0]<=value){
                value=Math.max(intervals[endPointer][1],value);
                ++endPointer;
            }
            temp[1]=Math.max(intervals[--endPointer][1],value);
            pointer=++endPointer;
            result.add(temp);
        }
        return result.stream().map(l-> Arrays.stream(l).toArray()).toArray(int[][]::new);
    }
}
