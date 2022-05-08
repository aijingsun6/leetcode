package org.alking.offer;

/**
 * https://leetcode-cn.com/problems/check-permutation-lcci/
 */
public class O2 {

    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] array = new int[26];
        for (char c : s1.toCharArray()) {
            array[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            if (--array[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
