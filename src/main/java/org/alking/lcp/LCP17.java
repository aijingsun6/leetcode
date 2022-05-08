package org.alking.lcp;

/**
 * https://leetcode-cn.com/problems/nGK0Fy/
 */
public class LCP17 {

    public int calculate(String s) {
        int x = 1;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                x = x * 2 + y;
            } else if (c == 'B') {
                y = y * 2 + x;
            }
        }
        return x + y;
    }
}
