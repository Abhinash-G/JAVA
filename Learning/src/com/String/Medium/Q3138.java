package com.String.Medium;

import java.util.Arrays;

public class Q3138 {
    public int minAnagramLength(String s) {
        int n = s.length();
        for (int possibleLength = 1; possibleLength <= n / 2 + 1; possibleLength++) {
            if (n % possibleLength > 0) {
                continue;
            }
            if (check(possibleLength, s)) {
                return possibleLength;
            }
        }
        return n;
    }

    private boolean check(int possibleLength, String s) {
        int[] mp = new int[26];
        int i = 0, n = s.length();

        while (i < possibleLength) {
            mp[s.charAt(i) - 'a']++;
            i++;
        }

        while (i < n) {
            int[] copyMP = new int[26];
            for (int j = 0; j < possibleLength; j++) {
                copyMP[s.charAt(i + j) - 'a']++;
            }
            if (!Arrays.equals(copyMP, mp)) {
                return false;
            }
            i += possibleLength;
        }
        return true;
    }
}
