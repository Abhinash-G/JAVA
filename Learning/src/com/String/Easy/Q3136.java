package com.String.Easy;

public class Q3136 {
    /*
    A word is considered valid if:
    It contains a minimum of 3 characters,
    It contains only digits (0-9), and English letters (uppercase and lowercase).
    It includes at least one vowel.
    It includes at least one consonant.
    */
    public boolean isValid(String word) {
        if(word.length()<3)
            return false;
        int consonant=0,vowel=0;
        for(char ch:word.toCharArray()){
            if((int)ch>=48 && (int)ch<=57)
                continue;
            if((ch=='a'||ch=='A')||(ch=='e'||ch=='E')||(ch=='i'||ch=='I')||(ch=='o'||ch=='O')||(ch=='u'||ch=='U'))
                vowel++;
            else if(((int)ch<91&&(int)ch>64)||((int)ch<123&&(int)ch>96))
                consonant++;
            else
                return false;
        }
        return (vowel>0 && consonant>0);
    }
}
