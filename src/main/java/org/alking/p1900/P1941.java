package org.alking.p1900;

/**
 * https://leetcode-cn.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
 */
public class P1941 {

    public boolean areOccurrencesEqual(String s) {

        int[] bucket = new int[26];
        for (char c : s.toCharArray()) {
            bucket[c - 'a']++;
        }

        int cnt = -1;
        for (int i = 0; i < 26; i++) {
            int c = bucket[i];
            if (c > 0) {
                if (cnt < 0) {
                    cnt = c;
                } else if (cnt != c) {
                    return false;
                }
            }
        }
        return true;
    }
}
