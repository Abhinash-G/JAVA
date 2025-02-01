package com.String.Medium;

import java.util.*;

public class Q451 {
    //Basic starter method
    {
//        public String frequencySort (String s){
//        if (s.length() <= 1)
//            return s;
//        HashMap<Character, Integer> charToFreq = new HashMap<>();
//        HashMap<Integer, ArrayList<Character>> freqToChar = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            ArrayList<Character> tempList = freqToChar.computeIfAbsent(charToFreq.getOrDefault(ch, 0) + 1, k -> new ArrayList<>());
//            tempList.add(ch);
//            if (charToFreq.containsKey(ch)) {
//                freqToChar.get(charToFreq.get(ch)).remove((Character) ch);
//            }
//            charToFreq.put(ch, charToFreq.getOrDefault(ch, 0) + 1);
//        }
//        Integer[] freqArray = freqToChar.keySet().toArray(new Integer[0]);
//        Arrays.sort(freqArray, Collections.reverseOrder());
//        StringBuilder result = new StringBuilder();
//        for (int i : freqArray) {
//            for (char ch : freqToChar.get(i).toArray(new Character[0])) {
//                for (int n = 0; n < i; n++)
//                    result.append(ch);
//            }
//        }
//        return result.toString();
//    }
    }

    //Faster than previous.
    {
//        public String frequencySort (String s){
//        if (s.length() <= 1) {
//            return s;
//        }
//        Map<Character, Integer> charToFreq = new HashMap<>();
//        for (char ch : s.toCharArray()) {
//            charToFreq.put(ch, charToFreq.getOrDefault(ch, 0) + 1);
//        }
//        List<Map.Entry<Character, Integer>> list = new ArrayList<>(charToFreq.entrySet());
//        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
//        StringBuilder result = new StringBuilder();
//        for (Map.Entry<Character, Integer> entry : list) {
//            for (int i = 0; i < entry.getValue(); i++) {
//                result.append(entry.getKey());
//            }
//        }
//        return result.toString();
//    }
    }
    // Big brain Solution
    public String frequencySort(String s) {
        int[][] freq = new int[75][2];
        for(int i = 0;i<s.length();i++){
            int key=s.charAt(i)-48;
            freq[key][0]++;
            freq[key][1] = s.charAt(i);
        }
        Arrays.sort(freq,(a,b)->b[0]-a[0]);
        StringBuilder result = new StringBuilder();
        for(int i=0;i<75;i++){
            if(freq[i][0] == 0){
                return result.toString();
            }
            for(int j = 0;j<freq[i][0];j++)
                result.append((char)(freq[i][1]));
        }
        return result.toString();
    }

}
