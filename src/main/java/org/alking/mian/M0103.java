package org.alking.mian;

/**
 * https://leetcode-cn.com/problems/string-to-url-lcci/
 */
public class M0103 {
    public String replaceSpaces(String S, int length) {
        char[] cache = new char[S.length()];
        int offset = 0;
        for (int i = 0; i < length; i++) {
            char c = S.charAt(i);
            if (c == ' ') {
                cache[offset++] = '%';
                cache[offset++] = '2';
                cache[offset++] = '0';
            } else {
                cache[offset++] = c;
            }
        }
        return new String(cache,0,offset);
    }
}
