package com.Arrays.Easy;

public class Q13 {
    public int romanToInt(String s) {
        int[] map=new int[26];
        
        map['I'-65]=1;
        map['V'-65]=5;
        map['X'-65]=10;
        map['L'-65]=50;
        map['C'-65]=100;
        map['D'-65]=500;
        map['M'-65]=1000;
        int result=0,i=0;
        for(i=0;i<s.length()-1;i++){
            result+=(map[s.charAt(i)-65]< map[s.charAt(i+1)-65])?(-1* map[(int) s.charAt(i)-65]):map[(int)s.charAt(i)-65];
        }
        return result+map[s.charAt(i)-65];
    }
}
