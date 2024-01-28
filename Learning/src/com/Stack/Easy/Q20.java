package com.Stack.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Q20 {
//    An input string is valid if:
//
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//    Every close bracket has a corresponding open bracket of the same type.
//    private char openingBracketFor(char ClossingBracket){
//        switch (ClossingBracket){
//            case ')':return '(';
//            case ']':return '[';
//            case '}':return '{';
//            default:
//                return ' ';
//        }
//    }
//    public boolean isValid(String s) {
//        if(s.length()%2!=0)
//            return false;
//        Stack<Character> stack=new Stack<>();
//        for(int i=0;i<s.length();i++){
//            char current_bracket=s.charAt(i);
//            if(current_bracket=='['||current_bracket=='{'||current_bracket=='(')
//                stack.push(current_bracket);
//            else{
//                if(!stack.isEmpty() && stack.peek()==openingBracketFor(current_bracket))
//                    stack.pop();
//                else
//                    return false;
//            }
//        }
//        return stack.isEmpty();
//    }

    public boolean isValid(String s) {
        if(s.length()%2!=0)
            return false;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char current_bracket=s.charAt(i);
            if(current_bracket=='['||current_bracket=='{'||current_bracket=='(')
                stack.push(current_bracket);
            else if(!stack.isEmpty()){
                if(current_bracket=='}' && stack.peek()=='{')
                    stack.pop();
                else if (current_bracket==')' && stack.peek()=='(')
                    stack.pop();
                else if (current_bracket==']' && stack.peek()=='[')
                    stack.pop();
                else
                    return false;
                }
            else
                return false;

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Q20 ob=new Q20();
        System.out.println(ob.isValid("))"));
    }
}
