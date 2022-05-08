package org.alking.p1700;

/**
 * https://leetcode-cn.com/problems/check-if-one-string-swap-can-make-strings-equal/
 */
public class P1790 {

    public boolean areAlmostEqual(String s1, String s2) {

        char[] cs1 = new char[2];
        char[] cs2 = new char[2];
        int offset = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2) {
                if (offset == 2) {
                    return false;
                }
                cs1[offset] = c1;
                cs2[offset] = c2;
                offset++;
            }
        }
        if (offset == 0) {
            return true;
        }

        if (offset == 2 && cs1[0] == cs2[1] && cs1[1] == cs2[0]) {
            return true;
        }
        return false;
    }
}
