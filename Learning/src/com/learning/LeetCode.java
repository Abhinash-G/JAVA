package com.learning;


import java.util.*;


public class LeetCode {

    public boolean rotateString(String s, String goal, int[] a) {
        if(s.equals(goal))
            return true;
        String ns=s.substring(1)+s.charAt(0);
        while(!ns.equals(s)){
            if(ns.equals(goal))
                return true;
            ns=ns.substring(1)+ns.charAt(0);
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode ob=new LeetCode();
        System.out.println(ob.rotateString("abcde", "cdeab", new int[]{1,2,3,4}));
    }
}
