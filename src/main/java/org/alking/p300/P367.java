package org.alking.p300;

import java.util.HashSet;

public class P367 {

    private static final HashSet<Integer> set = new HashSet<>();
    static {
        set.add(0);
        set.add(1);
        set.add(4);
        set.add(9);
        set.add(16);
        set.add(25);
        set.add(36);
        set.add(49);
        set.add(64);
        set.add(81);
        set.add(100);
    }

    public boolean isPerfectSquare(int num) {
        if (set.contains(num)) {
            return true;
        }

        long left = 2;
        long right = num/2;
        long mid;
        long p;
        while (left <= right) {
            mid = left + (right - left) / 2;
            p = mid * mid;
            if (p == num) {
                return true;
            } else if (p < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return false;
    }
}
