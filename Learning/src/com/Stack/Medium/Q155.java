package com.Stack.Medium;
import java.sql.SQLOutput;
import  java.util.*;

public class Q155 {
    static class MinStack {
        ArrayList<Integer> arr;
        ArrayList<Integer> min;
        public MinStack() {
            arr=new ArrayList<>();
            min=new ArrayList<>();
        }

        public void push(int val) {
            arr.add(val);
            if(min.isEmpty()){
                min.add(val);
            }
            else if(val<=min.get(min.size()-1)) {
                min.add(val);
            }
        }

        public void pop() {
            System.out.println((min.get(min.size()-1)+"   "+arr.get(arr.size()-1)));
            if(arr.get(arr.size()-1).intValue()==min.get(min.size()-1).intValue()) {
//                System.out.println("Removed Min");
                min.remove(min.size()-1);
            }
//            System.out.println("Removed:"+arr.get(arr.size()-1));
            arr.remove(arr.size()-1);
        }

        public int top() {
            if(arr.isEmpty())
                return -1;
            return arr.get(arr.size()-1);
        }

        public int getMin() {
            if(min.isEmpty())
                return -1;
            return min.get(min.size()-1);
        }
    }

    public static void main(String[] args) {
        MinStack ob=new MinStack();
        ob.push(512);
        ob.push(-1024);
        ob.push(-1024);
        ob.push(512);
        System.out.println(ob.arr.toString());
        System.out.println(ob.min.toString());
        ob.pop();
        System.out.println(ob.getMin());
        System.out.println(ob.min.toString());
        ob.pop();
        System.out.println(ob.getMin());
//        ob.pop();
//        System.out.println(ob.getMin());
//        System.out.println(ob.top());
//        System.out.println(ob.getMin());
        System.out.println(ob.min.toString());
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
