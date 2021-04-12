package org.alking.p100;

/**
 * https://leetcode-cn.com/problems/valid-palindrome/
 */
public class P125 {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char cleft = s.charAt(left);
            if (!Character.isLetterOrDigit(cleft)) {
                left++;
                continue;
            }
            char cright = s.charAt(right);
            if (!Character.isLetterOrDigit(cright)) {
                right--;
                continue;
            }
            if (Character.toLowerCase(cleft) != Character.toLowerCase(cright)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
