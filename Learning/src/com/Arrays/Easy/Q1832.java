package com.Arrays.Easy;

import java.util.HashSet;
import java.util.Set;

public class Q1832 {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)
            return false;

        //Method 1 using sets(Slower, as sets take time in incursion).
        {

//        Set<Integer> seq=new HashSet<>();
//        int i=0;
//        while(i<sentence.length() && seq.size()!=26){
//            seq.add((int)(sentence.charAt(i)));
//            i++;
//        }
//        System.gc();
//        return seq.size() == 26;
        }
//        Method 2 using Arrays(Faster but still uses a lot of space and 2 loops).
        {
//        boolean[] check=new boolean[26];
//        for(char c:sentence.toCharArray()){
//            check[c-'a']=true;
//        }
//        for(boolean b:check){
//            if(b!=true)
//                return false;
//        }
//        return true;
        }
//        Method 3 using String Functions and simple logic(Fastest).
        {
            for(int i=0;i<26;i++){
                char ch=(char) (97+i);
                if(sentence.lastIndexOf(ch)==-1)
                    return false;
            }
            return true;
        }
    }
}
