package com.String.Medium;

import java.util.Arrays;

public class Q443 {
    //Nested while
//    public int compress(char[] chars) {
//        if(chars.length==1)
//            return 1;
//        StringBuilder result=new StringBuilder();
//        int leftPointer=0,rightPointer=0;
//        while(rightPointer< chars.length && leftPointer<chars.length){
//            rightPointer=leftPointer+1;
//            char temp=chars[leftPointer];
//            if(temp!=chars[rightPointer]){
//                result.append(temp);
//            }
//            else {
//                int tempCount = 1;
//                while (rightPointer < chars.length && chars[rightPointer] == temp) {
//                    ++tempCount;
//                    ++rightPointer;
//                }
//                result.append(temp + Integer.toString(tempCount));
//            }
//            leftPointer = rightPointer;
//        }
//        int point=-1;
//        for(char ch:result.toString().toCharArray())
//            chars[++point]=ch;
//        return (point+1);
//    }

    //Simpler and Faster Solution with one loop.
    public int compress(char[] chars) {
        if(chars.length==1)
            return 1;
        int rightPointer=1,leftPointer=0,count=1;
        StringBuilder result=new StringBuilder();
        while(rightPointer<=chars.length && leftPointer<chars.length){
            if(rightPointer== chars.length || chars[leftPointer]!=chars[rightPointer]){
                result.append(chars[leftPointer]);
                if(count!=1)
                    result.append(count);
                count=1;
                leftPointer=rightPointer;
                rightPointer=leftPointer+1;
            }
            else{
                ++rightPointer;
                ++count;
            }
        }
        int point=-1;
        for(char ch:result.toString().toCharArray())
            chars[++point]=ch;
        return (point+1);
    }

    public static void main(String[] args) {
        Q443 ob=new Q443();
//        char[] ch=new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        char[] ch=new char[]{'a','b','c'};
        System.out.println(ob.compress(ch));
        System.out.println(Arrays.toString(ch));
    }
}