package org.alking.p1900;

/**
 * https://leetcode-cn.com/problems/sum-of-digits-of-string-after-convert/
 */
public class P1945 {

    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c - 'a' + 1);
        }
        int result = transLucky(sb.toString());
        for (int i = 0; i < k - 1; i++) {
            result = transLucky(result);
        }
        return result;
    }

    private int transLucky(String s) {
        int acc = 0;
        for (char c : s.toCharArray()) {
            acc += (c - '0');
        }
        return acc;
    }

    private int transLucky(int s) {
        int acc = 0;
        while (s > 0) {
            acc += (s % 10);
            s /= 10;
        }
        return acc;
    }
}
