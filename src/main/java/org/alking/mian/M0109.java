package org.alking.mian;

/**
 * https://leetcode-cn.com/problems/string-rotation-lcci/
 */
public class M0109 {

    public boolean isFlipedString(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s2.isEmpty() || s1.isEmpty()) {
            return false;
        }
        return (s1 + s1).contains(s2);
    }


}
