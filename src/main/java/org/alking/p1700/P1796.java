package org.alking.p1700;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/second-largest-digit-in-a-string/
 */
public class P1796 {

    public int secondHighest(String s) {

        // arr[0]> arr[1]
        int[] arr = new int[2];
        Arrays.fill(arr, -1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                int v = c - '0';
                if (arr[0] < 0) {
                    arr[0] = v;
                } else if (v > arr[0]) {
                    arr[1] = arr[0];
                    arr[0] = v;
                } else if (v < arr[0] && v > arr[1]) {
                    arr[1] = v;
                }

            }
        }
        return arr[1];
    }
}
