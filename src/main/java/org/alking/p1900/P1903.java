package org.alking.p1900;

/**
 * https://leetcode-cn.com/problems/largest-odd-number-in-string/
 */
public class P1903 {

    public String largestOddNumber(String num) {
        int N = num.length();
        if (N < 1) {
            return "";
        }
        char[] array = num.toCharArray();
        for (int i = N - 1; i >= 0; i--) {
            if ((array[i] - '0') % 2 == 1) {
                return new String(array, 0, i + 1);
            }
        }
        return "";
    }
}
