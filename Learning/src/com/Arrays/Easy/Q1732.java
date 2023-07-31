package com.Arrays.Easy;

public class Q1732 {
    public int largestAltitude(int[] gain) {
        int highest=0,sum=0;
        for(int i=0;i< gain.length;i++){
            sum+=gain[i];
            highest=Math.max(highest,sum);
        }
        System.gc();
        return highest;
    }
}
