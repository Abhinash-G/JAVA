package com.DP.Medium;
import java.util.*;
/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

Example 2:

Input: n = 1
Output: ["()"]

 */
public class Q22 {

    public List<String> generateParenthesis(int n) {
        ArrayList<String> result=new ArrayList<>();
        if(n==1) {
            result.add("()");
            return result;
        }
        ArrayList<String> left=new ArrayList<>(generateParenthesis(n-1));
        for(int i=0;i<left.size();i++){
            if(!result.contains("()"+left.get(i)))
                result.add("()"+left.get(i));
            if(!result.contains("("+left.get(i)+")"))
                result.add("("+left.get(i)+")");
            if(!result.contains(left.get(i)+"()"))
                result.add(left.get(i)+"()");
        }
        return result;
    }

    public static void main(String[] args) {
    Q22 ob=new Q22();
        System.out.println(Arrays.toString(ob.generateParenthesis(3).toArray()));
    }
}
