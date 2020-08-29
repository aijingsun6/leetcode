package org.alking.p200;

/**
 * https://leetcode-cn.com/problems/shortest-palindrome/
 */
public class P214 {

    /**
     * aacecaaa
     * aaacecaaa
     *
     * @param s
     * @return
     */
    public String shortestPalindrome(String s) {

        if (s == null || s.length() < 2) {
            return s;
        }
        if (checkString(s)) {
            return s;
        }


        for (int i = s.length() - 1; i > 0; i--) {

            String s2 = s.substring(i, s.length());
            s2 = new StringBuilder(s2).reverse().toString() + s;
            if (checkString(s2)) {
                return s2;
            }

        }
        return s;
    }

    private boolean checkString(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {

            if (arr[start] != arr[end]) {
                return false;
            }
            start += 1;
            end -= 1;
        }
        return true;

    }

}
