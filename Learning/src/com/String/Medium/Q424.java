package com.String.Medium;

import java.util.HashMap;
import java.util.Map;

public class Q424 {
    public static int characterReplacement(String s, int k) {
        if(s.length()==k)
            return k;
        int windowStart = 0, maxLength = 0, maxCount=0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char rightChar = s.charAt(windowEnd);
//            System.out.print(windowEnd+": "+rightChar+" : ");
            charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0) + 1);
            maxCount = Math.max(maxCount, charFrequencyMap.get(rightChar));
            while((windowEnd-windowStart+1)-maxCount>k){
                char leftChar = s.charAt(windowStart);
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1);
                if (charFrequencyMap.get(leftChar) == maxCount - 1) {
                    maxCount = 0;
                    for (int count : charFrequencyMap.values()) {
                        maxCount = Math.max(maxCount, count);
                    }
                }

                if (charFrequencyMap.get(leftChar) == 0) {
                    charFrequencyMap.remove(leftChar);
                }
                windowStart++;
            }
//            System.out.println("Start: "+ windowStart+ "  END: "+windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
//            System.out.println(maxLength);
        }
        return maxLength;
    }

    //Faster using an Array(GPT).
    {
//        public int characterReplacement (String s,int k){
//        int[] charFrequency = new int[26];
//        int windowStart = 0, maxLength = 0, maxCount = 0;
//
//        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
//            int index = s.charAt(windowEnd) - 'A';
//            maxCount = Math.max(maxCount, ++charFrequency[index]);
//
//            if (windowEnd - windowStart + 1 - maxCount > k) {
//                charFrequency[s.charAt(windowStart) - 'A']--;
//                windowStart++;
//            }
//            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
//        }
//        return maxLength;
//    }
    }
    public static void main(String[] args) {
        System.out.println(Q424.characterReplacement("AAAAABBBBCBB",4));
    }
}
