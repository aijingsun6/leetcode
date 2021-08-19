package org.alking.p1700;

/**
 * https://leetcode-cn.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
 */
public class P1784 {

    public boolean checkOnesSegment(String s) {
        int start = -1;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '1' && start == -1) {
                start = i;
            } else if (c == '0' && start > -1) {
                cnt++;
                start = -1;
            }
        }
        if (start > -1) {
            cnt++;
        }
        return cnt == 1;
    }
}
