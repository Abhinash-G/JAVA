package com.Arrays.Easy;


import java.util.ArrayList;
import java.util.List;

public class Q989 {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        for (int i = num.length - 1; i >= 0; --i) {
            res.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while (k > 0) {
            res.add(0, k % 10);
            k/= 10;
        }
        return res;
    }

    public static void main(String[] args) {
//        System.out.println(addToArrayForm(new int[]{2,0,5},806));
//        System.out.println(addToArrayForm(new int[]{9,9,9,9,9,9,9,9,9,9},1));
        System.out.println(addToArrayForm(new int[]{1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3},516));
    }
}
