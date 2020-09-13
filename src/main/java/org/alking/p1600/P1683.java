package org.alking.p1600;

public class P1683 {

    public boolean CheckPermutation(String s1, String s2) {

        if (s1 == null || s2 == null) {
            return false;
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] arr = new int['z' - 'a' + 1];

        for (char c : s1.toCharArray()) {
            arr[c - 'a'] += 1;
        }

        for (char c : s2.toCharArray()) {
            arr[c - 'a'] -= 1;
            if (arr[c - 'a'] < 0) {
                return false;
            }
        }

        return true;

    }
}
