package com.Greedy.Medium;

import com.Arrays.Easy.Q1;

public class Q122 {

    public int maxProfit(int[] prices) {
        int currentDay=0,totalProfit=0,purchaseCost=0,sellDay=0;
        while (currentDay<prices.length){
            while (currentDay<prices.length-1 && prices[currentDay]>=prices[currentDay+1]){
                currentDay++;
            }
            purchaseCost=prices[currentDay];
            sellDay=currentDay+1;
            while ((sellDay< prices.length-1) && (prices[sellDay] <= prices[sellDay + 1])){
                sellDay++;
            }
           if (sellDay < prices.length) {
            totalProfit += prices[sellDay] - purchaseCost; // Calculate profit
        }
            currentDay=sellDay+1;
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        Q122 ob=new Q122();
        System.out.println(ob.maxProfit(new int[]{7,1,5,3,6,4}));//7
    }
}
