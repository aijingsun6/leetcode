package org.alking.p900;

public class P942 {

    public int[] diStringMatch(String S) {
        int min = 0;
        int max = S.length();
        int[] res = new int[S.length() + 1];
        int idx = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == 'I') {
                res[idx++] = min;
                min = min + 1;
            } else if (c == 'D') {
                res[idx++] = max;
                max = max - 1;
            }
        }
        res[S.length()] = min;
        return res;

    }

}
