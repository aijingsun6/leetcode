package org.alking.p600;

/**
 * <a href="https://leetcode-cn.com/problems/palindromic-substrings/">647. 回文子串</a>
 */
public class P647 {

    public int countSubstrings(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        char[] arr = s.toCharArray();
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += findMax(arr, i);
        }
        return result;
    }

    private int findMax(char[] arr, int idx) {
        return findMax(arr, idx, idx) + findMax(arr, idx, idx + 1);
    }

    private int findMax(char[] arr, int left, int right) {
        int result = 0;
        while (true) {
            if (left < 0) {
                break;
            }
            if (right >= arr.length) {
                break;
            }
            if (arr[left] != arr[right]) {
                break;
            }
            result += 1;
            left--;
            right++;
        }
        return result;
    }
}
