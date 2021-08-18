package org.alking.p1400;

public class P1446 {

    public int maxPower(String s) {
        char lastC = 0;
        int cnt = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (c != lastC) {
                lastC = c;
                cnt = 1;
            } else {
                cnt += 1;
            }
            max = Math.max(max, cnt);
        }
        return max;
    }
}
