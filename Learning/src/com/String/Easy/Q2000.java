package com.String.Easy;

public class Q2000 {
    public String reversePrefix(String word, char ch) {
        int index=word.indexOf(ch);
        if(index==-1 || word.length()==1)
            return word;
        return (new StringBuilder(word.substring(0,index+1)).reverse()+word.substring(index+1));
    }
}
