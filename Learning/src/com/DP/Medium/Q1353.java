package com.DP.Medium;

import java.util.Arrays;

public class Q1353 {
    public static int maxEvents(int[][] events) {
        Arrays.sort(events,(a,b)->(a[0]-b[0] == 0)?(a[1]-b[1]):a[0]-b[0]);
        int day=0;
        int unattendedPointer=0;
        return 0;
    }

    private static void print(int[][] events) {
        for(int[] i:events){
            System.out.println(Arrays.toString(i));
        }
    }

    public static void main(String[] args) {
        int[][] check={
                {1,7},
                {1,4},
                {1,2},
                {5,9},
                {3,6},
                {2,4},
                {4,9},
                {2,8},
                {3,4},
                {6,9},
                {2,9},
                {2,1}
        };
        maxEvents(check);
    }
}
