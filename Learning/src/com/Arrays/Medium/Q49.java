package com.Arrays.Medium;

import java.util.*;

public class Q49 {
//    public static boolean isAnagram(String s, String t) {
//        char[] arrS = s.toCharArray();
//        char[] arrT = t.toCharArray();
//        Arrays.sort(arrS);
//        Arrays.sort(arrT);
//        return Arrays.equals(arrT,arrS);
//    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        //Slower method using nested loop.
//        {
//            List<List<String>> result = new ArrayList<List<String>>();
//            List<String> temp0 = new ArrayList<>();
//            temp0.add(strs[0]);
//            result.add(temp0);
//            for (int i = 1; i < strs.length; i++) {
//                int flag = 0;
//                for (int j = 0; j < result.size(); j++) {
//                    List<String> check = result.get(j);
//                    if (isAnagram(check.get(0), strs[i])) {
//                        check.add(strs[i]);
//                        result.remove(j);
//                        result.add(check);
//                        flag = 1;
//                        break;
//                    }
//                }
//                if (flag == 0) {
//                    ArrayList<String> temp = new ArrayList<>();
//                    temp.add(strs[i]);
//                    result.add(temp);
//                }
//            }
//            return result;
//        }
        //Using map and sorting to solve this.
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] r={"eat","tea","tan","ate","nat","bat"};
        System.out.println(Arrays.toString(groupAnagrams(r).toArray()));
    }
}
