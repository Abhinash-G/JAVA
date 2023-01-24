package com.learning;
import java.util.*;

class Solution {
    public void lengthOfLongestSubstring(String s) {
        String ss="",nss="";
        int j=1;

        //for(int i=0;i<s.length()-1;i++){
        //    nss=Character.toString(s.charAt(i));
        //    for(j=i+1;j<s.length();j++){
        //        if(nss.indexOf(s.charAt(j))>-1) {

        //        }
        //        else

        //    }
        //}






        /*for(int i=0;i<s.length()-1;i++) {
            nss=nss+s.charAt(i);
            for (j = i; j < s.length(); j++) {
                if (nss.indexOf(s.charAt(j)) > -1) {
                    if (ss.length() < nss.length()) {
                        ss = nss;
                        nss = "";
                        nss = nss + s.charAt(j);
                        continue;
                    }
                } else {
                    nss = nss + s.charAt(j);
                }
            }
            if(ss.length()<nss.length())
                ss=nss;
        }*/
            System.out.println("nss=" + nss);
            System.out.println("ss=" + ss);
    }
}
public class one_learning {
    public static void main(String[] args) {
        Solution ob= new Solution();
        ob.lengthOfLongestSubstring( "dvdf");
    }
}
