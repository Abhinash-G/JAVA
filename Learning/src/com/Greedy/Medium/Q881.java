package com.Greedy.Medium;

import java.util.Arrays;

public class Q881 {

    public int numRescueBoats(int[] people, int limit) {
        int result = 0;
        Arrays.sort(people);
        int temp, head = 0, tail = people.length - 1, required;
        while (head <= tail) {
            temp = people[tail--];
            required = limit - temp;
            if(people[head]<=required)
                head++;
            result++;
        }
        return result;
    }

    //Using Bucket Sort it is faster to solve but not space efficient.
    {
//        public int numRescueBoats ( int[] people, int limit){
//        int[] buckets = new int[limit + 1];
//
//        for (int p : people) buckets[p]++;
//
//        // System.out.println(Arrays.toString(buckets));
//
//        int start = 0;
//        int end = buckets.length - 1;
//        int boats = 0;
//
//        while (start <= end) {
//            //make sure the start always point to a valid number
//            while (start <= end && buckets[start] <= 0) start++;
//
//            //make sure end always point to valid number
//            while (start <= end && buckets[end] <= 0) end--;
//
//            //no one else left on the ship, hence break.
//            if (buckets[start] <= 0 && buckets[end] <= 0) break;
//
//            boats++;
//
//            // both start and end can carry on the boat
//            if (start + end <= limit) buckets[start]--;
//
//            buckets[end]--;
//        }
//
//        return boats;
//    }
    }
    //Optimal solution for the problem if no. of people is not a problem
    {
//        public static int numRescueBoats ( int[] people, int limit){
//        int result = 0;
//        Arrays.sort(people);
//        int temp = 0, head = 0, tail = people.length - 1, required = 0;
//        while (head <= tail) {
//            temp = people[tail--];
//            required = limit - temp;
//            while (head <= tail && people[head] <= required) {
//                System.out.print(people[head] + " ");
//                temp += people[head++];
//                required = limit - temp;
//            }
//            result++;
//        }
//        return result;
//    }
    }

}
