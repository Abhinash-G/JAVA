package com.Greedy.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Q435 {
    //Slower as the prev hold the position mot value.
    {
//    public static int eraseOverlapIntervals(int[][] intervals) {
//        if(intervals.length==1)
//            return 0;
//        Arrays.sort(intervals,(a, b)->a[1]-b[1]);
//        ArrayList<int[]> list=new ArrayList<>();
//        int count=1,prev=0;
//        for (int i = 1; i < intervals.length; i++) {
//            if (intervals[i][0] >= intervals[prev][1]) {
//                prev = i;
//                count++;
//            }
//        }
//        return intervals.length - count;
//    }
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        int max=1;
        Arrays.sort(intervals,(a,b)->(a[1]-b[1]));
        int prev=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(prev<=intervals[i][0])
            {
                max++;
                prev=intervals[i][1];
            }
        }
        return intervals.length-max;
    }

    public static void main(String[] args) {
        int[][] input={{1,2},{2,3},{3,4},{1,3}};
        System.out.println(Q435.eraseOverlapIntervals(input));
    }
}
