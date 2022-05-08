package org.alking.p1800;

import java.util.HashSet;

/**
 * https://leetcode-cn.com/problems/number-of-different-integers-in-a-string/
 */
public class P1805 {

    public int numDifferentIntegers(String word) {
        int start = -1;
        int cnt = 0;
        String acc = "";
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isDigit(c)) {
                if (start == -1) {
                    start = c;
                }
                if (!"".equals(acc) || c != '0') {
                    acc = acc + c;
                }

            } else {
                if (start != -1) {
                    start = -1;
                    if (!set.contains(acc)) {
                        set.add(acc);
                        cnt++;
                    }

                }
                acc = "";
            }

        }
        if (start != -1 && !set.contains(acc)) {
            cnt++;
        }
        return cnt;
    }
}
