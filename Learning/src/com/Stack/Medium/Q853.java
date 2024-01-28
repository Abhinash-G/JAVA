package com.Stack.Medium;

import java.util.Arrays;
import java.util.Stack;

public class Q853 {
    
    void sort(int position[],int[] speed)
    {
        int n = position.length;
        for (int i = 1; i < n; ++i) {
            int key = position[i];
            int key2=speed[i];
            int j = i - 1;
            while (j >= 0 && position[j] < key) {
                position[j + 1] = position[j];
                speed[j+1]=speed[j];
                j = j - 1;
            }
            position[j + 1] = key;
            speed[j+1]=key2;
        }
    }
    public int carFleet(int target, int[] position, int[] speed) {
        if(position.length<=1)
            return 1;
        int result=0;
        sort(position,speed);
        System.out.println(Arrays.toString(position));
        System.out.println(Arrays.toString(speed));
        Stack<Integer> index=new Stack<>();
        index.push(0);
        for(int i=1;i< position.length;i++){
            if(speed[index.peek()]<speed[i]) {
                int requiredTime=(position[index.peek()] - position[i])/(speed[i]-speed[index.peek()]);
                if((position[index.peek()]+(speed[index.peek()]*requiredTime))<target) {
                    int steps = (position[index.peek()] - position[i]) / (speed[i] - speed[index.peek()]);
                    System.out.println("group " + i + " " + index.peek());
                    System.out.println(steps);
                    continue;
                }
            }
            index.push(i);
        }
        System.out.println(index.toString());
        return index.size();
    }

    public static void main(String[] args) {
        Q853 ob=new Q853();
        int target=13;
        int[] position={10,2,5,7,4,6,11};
        int[] speed={7,5,10,5,9,4,1};
        System.out.println(ob.carFleet(target,position,speed));
    }
}
