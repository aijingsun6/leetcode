package org.alking.leetcode.p0;

/**
 * 典型的滑动窗口
 */
public class P3 {

    public int lengthOfLongestSubstring(String s) {
        final int N = s.length();
        int[] countArr = new int[256];
        int result = 0;
        int left = 0;
        int right = 0;
        while (right < N) {
            int ch = s.charAt(right);
            countArr[ch]++;
            while (countArr[ch] > 1) {
                int lch = s.charAt(left);
                countArr[lch]--;
                left++;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }
}
