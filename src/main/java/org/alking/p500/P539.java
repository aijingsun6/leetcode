package org.alking.p500;

import java.util.List;

public class P539 {

    // n  < nlogn
    public int findMinDifference(List<String> timePoints) {
        int[] bucket = new int[60 * 24];
        for (String s : timePoints) {
            int m = parseMin(s);
            if (++bucket[m] > 1) {
                return 0;
            }
        }
        int min = Integer.MAX_VALUE;
        int first = -1;
        int last = -1;
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] == 0) {
                continue;
            }
            if (last == -1) {
                last = i;
                first = i;
                continue;
            }
            min = Math.min(min, i - last);
            last = i;

        }
        min = Math.min(min, Math.abs(first + 60*24 - last));
        return min;
    }

    private int parseMin(String s) {
        int h = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
        int m = (s.charAt(3) - '0') * 10 + (s.charAt(4) - '0');
        return 60 * h + m;

    }

}
