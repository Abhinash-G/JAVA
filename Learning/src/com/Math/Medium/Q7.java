package com.Math.Medium;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Q7 {
    public static int reverse(int x) {
        int sign=1;
        if(x<0){
            sign=-1;
            x*=-1;
        }
        int result=0;
        while(x>0){
            result=result*10+x%10;
            x/=10;
        }
        return sign*result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234));
        System.out.println(reverse(-1234));
        System.out.println(MAX_VALUE);
        System.out.println(reverse(MAX_VALUE));
        System.out.println(MIN_VALUE);
        System.out.println(reverse(MIN_VALUE));
        System.out.println(reverse(0));
    }
}
