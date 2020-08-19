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
        return findMax(arr, idx, 0, 0) + findMax(arr, idx, 0, 1);
    }

    private int findMax(char[] arr, int idx, int left, int right) {
        int result = 0;
        int idxLeft;
        int idxRight;
        while (true) {
            idxLeft = idx - left;
            idxRight = idx + right;
            if (idxLeft < 0) {
                break;
            }
            if (idxRight >= arr.length) {
                break;
            }
            if (arr[idxLeft] != arr[idxRight]) {
                break;
            }
            result += 1;
            left++;
            right++;
        }
        return result;
    }
}
