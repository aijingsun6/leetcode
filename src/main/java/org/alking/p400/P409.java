package org.alking.p400;

/**
 * <a href="https://leetcode-cn.com/problems/longest-palindrome/">409. 最长回文串</a>
 */
public class P409 {

    public int longestPalindrome(String s) {
        int size = 'z' - 'A' + 1;
        int[] arr = new int[size];
        for (char c : s.toCharArray()) {
            arr[c - 'A'] += 1;
        }
        boolean odd = false;
        int sum = 0;
        for (int v : arr) {
            if (v % 2 == 0) {
                sum += v;
            } else if (odd) {
                sum += (v - 1);
            } else {
                sum += v;
                odd = true;
            }
        }
        return sum;
    }
}
