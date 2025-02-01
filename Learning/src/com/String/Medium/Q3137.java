package com.String.Medium;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Q3137 {
    /*
    You are given a string word of size n, and an integer k such that k divides n.
    In one operation, you can pick any two indices i and j, that are divisible by k,
    then replace the substring of length k starting at i
    with the substring of length k starting at j.
    That is, replace the substring word[i..i + k - 1] with the substring word[j..j + k - 1].

    Return the minimum number of operations required to make word k-periodic.
    We say that word is k-periodic if there is some string s of length k such that
    word can be obtained by concatenating s an arbitrary number of times.
    For example, if word == “ababab”, then word is 2-periodic for s = "ab".
    */


    public static int minimumOperationsToMakeKPeriodic(String word, int k) {
        if(word.length()==k)
            return 0;
        int len=word.length();
        HashMap<String,Integer> table=new HashMap<>();
        int max=1;
        for(int i=0;i<len;i+=k){
            String temp=word.substring(i,i+k);
            table.put(temp,table.getOrDefault(temp,0)+1);
        }
        for(int temp:table.values())
            max=Math.max(max,temp);
        return (len/k - max);
    }

    public static void main(String[] args) {
        System.out.println(Q3137.minimumOperationsToMakeKPeriodic("leetcodeleet",4));
    }
}
