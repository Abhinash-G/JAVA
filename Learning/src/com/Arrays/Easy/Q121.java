package com.Arrays.Easy;

import java.util.ArrayList;

public class Q121 {
//    Slower solution using List.
/*
    public static int maxProfit(int[] prices) {
        int max=0;
        ArrayList<Integer> max_sell=new ArrayList<>();
        max_sell.add(0,prices[prices.length-1]);
        for(int i=prices.length-2;i>0;i--){
            max_sell.add(0,Math.max(max_sell.get(0),prices[i]));
        }
        for(int i=0;i< prices.length-1;i++){
            max=Math.max(max,max_sell.get(i)-prices[i]);
        }
        return max;
    }
*/
public static int maxProfit(int[] prices) {
        int buy_prize=prices[0],max=0;
        for(int i=0;i< prices.length;i++){
            if(buy_prize>prices[i])
                buy_prize=prices[i];
            else{
                max=Math.max(max,prices[i]-buy_prize);

            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,6,3,4,1}));
    }
}
