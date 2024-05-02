package com.Stack.Hard;

import java.util.Arrays;
import java.util.Stack;

public class Q84 {
    public static int largestRectangleArea(int[] heights) {
        if(heights.length==1)
            return heights[0];
        int length=heights[0], breath=1;
        Stack<Integer> area=new Stack<>();
        area.push(heights[0]);
        int pointerHead=0, pointerTail=0;
        for(int i=1;i<heights.length;i++){
            pointerTail=heights[i];
            if(pointerTail==0){
                pointerHead=i+1;
                continue;
            }
            length=Math.min(length,pointerTail);
            breath=i-pointerHead+1;
            System.out.println(i+": l="+length+" b= "+breath);
            int currArea=length*breath;
            System.out.println(i+": curr"+currArea+" value "+pointerTail);
            if(currArea<=pointerTail){
                pointerHead=i;
                length=heights[pointerHead];
                currArea=pointerTail;
            }
            if(currArea>=area.peek()) {
                area.push(currArea);
            }
            System.out.println("Current Answer= "+area.peek());
        }
        return area.peek();
    }
        public static void main(String[] args) {
            System.out.println(Q84.largestRectangleArea(new int[]{1,2,3,4,5}));
        }
    }


