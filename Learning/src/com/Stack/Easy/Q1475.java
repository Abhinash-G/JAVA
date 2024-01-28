package com.Stack.Easy;

import java.util.Stack;
/*
You are given an integer array prices where prices[i] is the price of the ith item in a shop.

There is a special discount for items in the shop. If you buy the ith item, then you will receive a discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i]. Otherwise, you will not receive any discount at all.

Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop, considering the special discount.
 */
public class Q1475 {
//    Stack

//    public int[] finalPrices(int[] prices) {
//        int[] answer=new int[prices.length];
//        Stack<Integer> index=new Stack<>();
//        index.push(0);
//        for(int i=1;i<prices.length;i++){
//            while(!index.isEmpty() && prices[index.peek()]>=prices[i]){
//                answer[index.pop()]=prices[index.peek()]-prices[i];
//            }
//            index.push(i);
//        }
//        if(index.isEmpty())
//            return answer;
//        else{
//            while(!index.isEmpty()){
//                answer[index.pop()]=prices[index.peek()];
//            }
//        }
//        return answer;
//    }

//    Loop implementation
    public int[] finalPrices(int[] prices) {
        int a[]=new int[prices.length];
        int k=0, j;
        for(int i=0; i<prices.length; i++){
            for(j=i+1; j<prices.length; j++){
                if(prices[i]>=prices[j]){
                    a[i]=(prices[i]-prices[j]);
                    //System.out.println(prices[i]);
                    break;
                }
            }
            if(j==prices.length){
                a[i]=prices[i];
            }
        }
        return a;
    }
}
