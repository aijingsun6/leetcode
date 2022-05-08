package org.alking.p1800;

public class P1869 {

    private int findMaxSize(String s, char c) {
        int start = -1;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != c) {
                start = -1;
                continue;
            }
            if (start < 0) {
                start = i;
            }
            max = Math.max(max, i - start + 1);
        }
        return max;

    }

    public boolean checkZeroOnes(String s) {
        int maxOne = findMaxSize(s, '1');
        int maxZero = findMaxSize(s, '0');
        return maxOne > maxZero;
    }
}
