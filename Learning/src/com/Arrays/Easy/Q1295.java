package com.Arrays.Easy;

public class Q1295 {
    public int findNumbers(int[] nums) {
        int count=0;
        //Using String functions.
        {
//            for (int i : nums) {
//                if (Integer.toString(i).length() % 2 == 0)
//                    count++;
//            }
        }

//        Using nested loops
        {
//            for(int i:nums){
//                int len=0;
//                while(i>0){
//                    i=i/10;
//                    len++;
//                }
//                if(len%2==0)
//                    count++;
//            }
        }

        //Using Mathematical Formula.
        {
            for (int i : nums) {
                if ((int) (Math.log10(i) + 1) % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
