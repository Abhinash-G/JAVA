package com.String.Medium;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Q567 {
    public static boolean checkEqual(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkInclusion(String s1, String s2) {
        int[] count1 = new int[26];
        Arrays.fill(count1, 0);
        for (char c : s1.toCharArray()) {
            count1[c - 'a']++;
        }
        int s = 0;
        int e = s1.length();
        int[] count2 = new int[26];
        Arrays.fill(count2, 0);

        while (s < e && s < s2.length()) {
            count2[s2.charAt(s) - 'a']++;
            s++;
        }
        if (checkEqual(count1, count2)) {
            return true;
        }

        while (s < s2.length()) {
            char newChar = s2.charAt(s);
            count2[newChar - 'a']++;

            char oldChar = s2.charAt(s - e);
            count2[oldChar - 'a']--;
            s++;
            if (checkEqual(count1, count2)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        String s1="adc",
//                s2="dcda";
        String s1 = "ab",
                s2 = "eidboaoo";
        System.out.println(checkInclusion(s1, s2));
    }
}
