package org.alking.p300;

import java.util.HashMap;

public class P397 {

    private HashMap<Integer, Integer> map = new HashMap<>();

    public int integerReplacement(int n) {

        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        if (map.containsKey(n)) {
            return map.get(n);
        }
        int result = 0;
        if (n % 2 == 0) {
            result = 1 + integerReplacement(n / 2);
        } else {
            int left = 0;
            if (n < Integer.MAX_VALUE) {
                left = 1 + integerReplacement(n + 1);
            } else {
                left = 2 + integerReplacement(n / 2 + 1);
            }
            int right = 1 + integerReplacement(n - 1);
            result = Math.min(left, right);
        }
        map.put(n, result);
        return result;
    }
}
