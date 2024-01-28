package com.Arrays.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class Q242 {
//    Given two strings s and t, return true if t is an anagram of s, and false otherwise.

//    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
//        else{
//            HashMap<Character,Integer> mapT=new HashMap<>();
//            HashMap<Character,Integer> mapS=new HashMap<>();
//            for(int i=0;i<s.length();i++){
//                if(mapS.containsKey(s.charAt(i))){
//                    mapS.replace(s.charAt(i),mapS.get(s.charAt(i))+1);
//                }
//                else mapS.put(s.charAt(i),1);
//
//                if(mapT.containsKey(t.charAt(i))){
//                    mapT.replace(t.charAt(i),mapT.get(t.charAt(i))+1);
//                }
//                else mapT.put(t.charAt(i),1);
//            }
//            return(mapS.equals(mapT));
//        }
        else {
            char[] arrS = s.toCharArray();
            char[] arrT = t.toCharArray();
            Arrays.sort(arrS);
            Arrays.sort(arrT);
            return Arrays.equals(arrT,arrS);
        }
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("nagaram","anagram"));
    }
}
