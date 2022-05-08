package org.alking.offer;

/**
 * https://leetcode-cn.com/problems/is-unique-lcci/
 */
public class O1 {

    public boolean isUnique(String astr) {

        if (astr.length() > 26) {
            return false;
        }
        int[] array = new int[26];
        for (char c : astr.toCharArray()) {
            if (++array[c - 'a'] > 1) {
                return false;
            }
        }
        return true;
    }
}
