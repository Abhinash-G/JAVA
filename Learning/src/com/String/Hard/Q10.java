package com.String.Hard;

import java.util.HashMap;
import java.util.Hashtable;

public class Q10 {
    HashMap<String,Boolean> map=new HashMap<>();
    public boolean isMatch(String s, String p) {
        if(p.isEmpty() && s.isEmpty())
            return true;
//        else if(s.isEmpty())
//            return isMatch("",p);
        else if(p.isEmpty())
            return false;
        else if(s.isEmpty()){
            return (allEmpty(p));
        }
        else{
            String key=s.concat(p);
            if(map.containsKey(key)){
                return map.get(key);
            }
            int lastIndexP=p.length()-1;
            int lastIndexS=s.length()-1;
//            System.out.println(s +"    "+p);
            if(p.charAt(lastIndexP)=='*'){
                if(p.charAt(lastIndexP-1)=='.' || s.charAt(lastIndexS)==p.charAt(lastIndexP-1)){
                    map.put(key,isMatch(s.substring(0,lastIndexS),p) || isMatch(s,p.substring(0,lastIndexP-1)));
                }
                else{
                    map.put(key,isMatch(s,p.substring(0,lastIndexP-1)));
                }
            }
            else{
                if(s.charAt(lastIndexS)==p.charAt(lastIndexP) || p.charAt(lastIndexP)=='.')
                    map.put(key,isMatch(s.substring(0,lastIndexS),p.substring(0,lastIndexP)));
                else
                    return false;
            }
            return map.get(key);
        }
    }

    private boolean allEmpty(String p) {
        System.out.println(p);
        if(p.length()%2!=0)
            return false;
        for(int i=1;i<p.length();i+=2){
            if(p.charAt(i)!='*')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Q10 ob=new Q10();
        System.out.println(ob.isMatch("a",".*..a*"));
//        System.out.println(ob.isMatch("aaaaccccd","aa*ac*."));
//        System.out.println(ob.isMatch("aaaaccccd","a*ac*."));
//        String[] s={"a","a","ab","aa","abba","aaaabbb","mississippi","mississippi"};
//        String[] p={"a",".","ab","a*","a.*.","aa*aab.b","mis*is*p*.","mis*is*ip*."};
//        for(int i=0;i<s.length;i++)
//            System.out.println(ob.isMatch(s[i],p[i]));
    }
}
