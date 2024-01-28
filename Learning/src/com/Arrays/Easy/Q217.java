package com.Arrays.Easy;

import java.util.*;

public class Q217 {
    public static boolean containsDuplicate(int[] nums) {
        //using set
        {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            if(set.contains(i))
                return true;
            else
                set.add(i);
        }
        return false;
        }
    }
}
