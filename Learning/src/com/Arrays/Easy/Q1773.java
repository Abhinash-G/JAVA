package com.Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class Q1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int j=(ruleKey.equals("type"))?0:(ruleKey.equals("color"))?1:2;
            int count=0;
            for(int i=0;i<items.size();i++){
                if(items.get(i).get(j).equals(ruleValue))
                    count++;
            }
            System.gc();
            return count;
    }
}
