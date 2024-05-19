package com.Stack.Medium;

import java.util.Arrays;
import java.util.Stack;

public class Q735 {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int i:asteroids){
            if(stack.isEmpty())
                stack.push(i);
            else if((i>=0 && stack.peek()>=0) ||(i<0 && stack.peek()<0))
                stack.push(i);
            else {
                int flag=0;
                while (!stack.isEmpty() && (i < 0 && stack.peek() >= 0)) {
                    if ( i*-1 >stack.peek()) {
                        stack.pop();
                    } else if (i*-1 < stack.peek()){
                        flag=1;
                        break;
                    }
                    else {
                        stack.pop();
                        flag=1;
                        break;
                    }
                }
                if(flag!=1)
                    stack.push(i);
            }
        }
        int[] result =new int[stack.size()];
        for(int i=result.length-1;i>=0;i--){
            result[i]=stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Q735.asteroidCollision(new int[]{-3,5,8})));
    }
}
