package com.BinarySearch.Medium;

import java.util.Arrays;

public class Q875 {
    public int minEatingSpeed(int[] piles, int h) {
        if(h == piles.length)
            return Arrays.stream(piles).max().getAsInt();
        int max = Arrays.stream(piles).max().getAsInt(),min=1,mid=0;
        while(min<max){
            mid = min+(max-min) / 2;
            int hForMid=findHforK(piles, mid);
            System.out.println(mid+ "   "+ hForMid);
            if(hForMid<=h)
                max=mid;
            else
                min=mid+1;
        }
        return min;
    }

    private int findHforK(int[] piles,int k) {
            int h=0;
            for(int i=0;i< piles.length;i++){
                h+=(piles[i]%k == 0)?(piles[i]/k):(piles[i]/k+1) ;
            }
            return h;
    }

    public static void main(String[] args) {
        int[] piles={1,1,1,999999999};
        Q875 ob=new Q875();
        System.out.println(ob.findHforK(piles,142857145));
        System.out.println(ob.minEatingSpeed(piles,10));//142857143
    }
}
