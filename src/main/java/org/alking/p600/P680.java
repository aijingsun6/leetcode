package org.alking.p600;

public class P680 {

    public boolean validPalindrome(String s) {
        if (s == null || s.length() == 0 || s.length() < 2) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char cl = s.charAt(left);
            char cr = s.charAt(right);
            if (cl == cr) {
                left++;
                right--;
            } else {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);

            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {

        while (left < right) {
            char cl = s.charAt(left);
            char cr = s.charAt(right);
            if (cl == cr) {
                left++;
                right--;
            } else {
                return false;
            }

        }
        return true;
    }
}
