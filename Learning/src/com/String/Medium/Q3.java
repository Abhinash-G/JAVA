package com.String.Medium;

import java.util.Hashtable;

/*
Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Q3 {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()<2)
            return s.length();
        Hashtable<Character,Integer> table=new Hashtable<>();
        table.put(s.charAt(0),1);
        int max=1;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(table.containsKey(ch)){
                table.put(ch,i-table.get(ch));
            }
            else{
                table.put(ch,table.get(s.charAt(i-1))+1);
            }
            max=Math.max(max,table.get(ch));
            System.out.println("Max: "+ch+" "+max +" index: "+i);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabdbb"));
    }
}
