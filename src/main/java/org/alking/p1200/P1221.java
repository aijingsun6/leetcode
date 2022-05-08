package org.alking.p1200;

public class P1221 {

    public int balancedStringSplit(String s) {
        int acc = 0;
        int N = s.length();
        int lC = 0;
        int rC = 0;
        for (int i = 0; i < N; i++) {
            char c = s.charAt(i);
            if (c == 'L') {
                lC += 1;
            } else {
                rC += 1;
            }
            if (lC == rC) {
                acc += 1;
                lC = 0;
                rC = 0;
            }
        }
        return acc;
    }
}
