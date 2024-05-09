package com.Greedy.Medium;

import java.util.Arrays;

public class Q3075 {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long result=0L;
        int c=0;
        for(int i=happiness.length-1;i>=happiness.length-k;i--){
            int value=(happiness[i]-c++);
            if(value>0)
                result+=value;
        }
        return result;
    }

}
