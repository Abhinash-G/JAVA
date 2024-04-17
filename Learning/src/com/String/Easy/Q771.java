package com.String.Easy;

import java.util.HashSet;

public class Q771 {
    //Basic Approach
    {
//        public int numJewelsInStones (String jewels, String stones){
//        HashSet<Character> table = new HashSet<>();
//        for (char ch : jewels.toCharArray())
//            table.add(ch);
//        int resultCount = 0;
//        for (char ch : stones.toCharArray()) {
//            if (table.contains(ch))
//                ++resultCount;
//        }
//        return resultCount;
//    }
    }
    //Faster using String Function
    {
//        public int numJewelsInStones (String jewels, String stones){
//        int resultCount = 0;
//        for (char ch : stones.toCharArray()) {
//            if (jewels.contains(Character.toString(ch)))
//                ++resultCount;
//        }
//        return resultCount;
//        }
    }
    //Faster as indexOf() is faster than contains()
    public int numJewelsInStones(String jewels, String stones) {
        int resultCount=0;
        for(char ch:stones.toCharArray()){
            if(jewels.indexOf(ch)!=-1)
                ++resultCount;
        }
        return resultCount;
    }
}
