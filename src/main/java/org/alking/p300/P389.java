package org.alking.p300;

public class P389 {


    public char findTheDifference(String s, String t) {
        int[] arr = new int['z' - 'a' + 1];
        for (char c : s.toCharArray()) {
            arr[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {

            if (--arr[c - 'a'] < 0) {
                return c;
            }

        }
        return 'a';
    }
}
