package com.String.Medium;

import java.util.HashMap;

public class Q2981 {
    public static int maximumLength(String s) {
        if(s.length()==3){
            if(s.charAt(0)==s.charAt(1) && s.charAt(1)==s.charAt(2))
                return 1;
            else
                return -1;
        }
        int window=s.length()-2,length=s.length();
        while(window>0){
            HashMap<String,Integer> map=new HashMap<>();
            for(int i=0;i<(length-window+1);i++){
                String subString=s.substring(i,i+window);
                if(special(subString)) {
                    System.out.println(subString);
                    if (map.containsKey(subString)) {
                        if (map.get(subString) == 2) {
                            return window;
                        }
                        map.replace(subString, map.get(subString) + 1);
                    } else
                        map.put(subString, 1);
                }
            }
            --window;
        }
        return -1;
    }

    private static boolean special(String subString) {
        for(int i=0;i<subString.length()-1;i++){
            if(subString.charAt(i)!=subString.charAt(i+1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(maximumLength("cccerrrecdcdccedecdcccddeeeddcdcddedccdceeedccecde"));
    }
}
