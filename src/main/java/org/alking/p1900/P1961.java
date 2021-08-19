package org.alking.p1900;

/**
 * https://leetcode-cn.com/problems/check-if-string-is-a-prefix-of-array/
 */
public class P1961 {

    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            String to = sb.toString();
            if (to.equals(s)) {
                return true;
            }
            if (to.length() >= s.length()) {
                return false;
            }
        }
        return false;
    }
}
