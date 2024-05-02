package com.BitManipulation.Medium;

import java.math.BigInteger;

public class Q371 {
    public static int getSum(int a, int b) {
        while(b!=0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Q371.getSum(3,6));
    }
}
