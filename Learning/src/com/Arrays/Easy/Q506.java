package com.Arrays.Easy;

import java.util.*;

public class Q506 {
//    public String[] findRelativeRanks(int[] score) {
//        PriorityQueue<Integer> list=new PriorityQueue<>(Collections.reverseOrder());
//        for(int i:score)
//            list.offer(i);
//        HashMap<Integer,String> map=new HashMap<>();
//        int count=0;
//        while (!list.isEmpty()){
//            count++;
//            map.put(list.poll(),(count==1)?"Gold Medal":(count==2)?"Silver Medal":(count==3)?"Bronze Medal":Integer.toString(count));
//        }
//        String[] result=new String[score.length];
//        for(int i=0;i<score.length;i++){
//            result[i]=map.get(score[i]);
//        }
//        return result;
//    }

    //Faster than above
//    public String[] findRelativeRanks(int[] score) {
//        int[] copy=score.clone();
//        Arrays.sort(copy);
//        int count= score.length;
//        HashMap<Integer,String> map=new HashMap<>();
//        while (count>0){
//            map.put(copy[score.length-count],(count==1)?"Gold Medal":(count==2)?"Silver Medal":(count==3)?"Bronze Medal":Integer.toString(count));
//            count--;
//        }
//        String[] result=new String[score.length];
//        for(int i=0;i<score.length;i++){
//            result[i]=map.get(score[i]);
//        }
//        return result;
//    }
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] sortedScore = score.clone();
        Arrays.sort(sortedScore);
        String[] ranks = new String[n];

        for (int i = 0; i < n; i++) {
            int rank = Arrays.binarySearch(sortedScore, score[i]);
            if (rank == n - 1) {
                ranks[i] = "Gold Medal";
            } else if (rank == n - 2) {
                ranks[i] = "Silver Medal";
            } else if (rank == n - 3) {
                ranks[i] = "Bronze Medal";
            } else {
                ranks[i] = String.valueOf(n - rank);
            }
        }

        return ranks;
    }
}
