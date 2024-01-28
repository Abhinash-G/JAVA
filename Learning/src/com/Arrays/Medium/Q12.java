package com.Arrays.Medium;

import java.util.Arrays;

public class Q12 {
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
    public static String intToRoman(int num) {
        int[] number={1000,500,100,50,10,5,1};
        char[] roman={'M','D','C','L','X','V','I'};
        int current_freq=0,prev_freq=0;
        StringBuilder result= new StringBuilder();
        for(int i=0;i<number.length;i++){
            current_freq=num/number[i];
            if(current_freq==4) {
                if (number[i - 1] / number[i] == 5 && prev_freq != 0) {
                    result.deleteCharAt(result.length()-1);
                    result.append(roman[i]).append(roman[i - 2]);
                }
                else
                    result.append(roman[i]).append(roman[i - 1]);
            }
            else
                result.append(String.valueOf(roman[i]).repeat(Math.max(0,current_freq)));
            num%=number[i];
            prev_freq=current_freq;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(1653));
        System.out.println(intToRoman(3459));
        System.out.println(intToRoman(900));
    }
}
