package com.learning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution_12 {
    public static int reverseNumber(int n) {
        int a = 0;
        while (n != 0) {
            a = a * 10 + n % 10;
            n = n / 10;
        }
        return a;
    }

}
class Solution_13 extends Solution_12{
    public static int sumOfNumber(int n){
        int a=0;
        while(n!=0){
            a=a+n%10;
            n=n/10;
        }
        return a;
    }
}

public class Sum_1st extends Solution_13 {
    public static void main(String[] args) {
        System.out.println("reverse of 543="+reverseNumber(543));
        System.out.println("Sum of 543="+sumOfNumber(543));
    }
}
