package org.alking.p1800;

import java.util.ArrayList;

/**
 * https://leetcode-cn.com/problems/truncate-sentence/
 */
public class P1816 {

    public String truncateSentence(String s, int k) {
        final int N = s.length();
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
            if (count == k) {
                return s.substring(0, i);
            }
        }
        return s;
    }
}
