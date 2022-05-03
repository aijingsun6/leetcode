package org.alking.p2000;

public class P2027 {

    public int minimumMoves(String s) {
        int result = 0;
        int last = -1;
        for (int i = 0; i < s.length(); i++) {
            if (last < 0 && s.charAt(i) == 'O') {
                continue;
            }
            if (last < 0) {
                last = i;
                continue;
            }
            if (i - last > 2) {
                result++;
                if (s.charAt(i) == 'X') {
                    last = i;
                } else {
                    last = -1;
                }
            }
        }
        if (last != -1) {
            result++;
        }
        return result;
    }
}
