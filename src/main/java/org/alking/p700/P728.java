package org.alking.p700;

import java.util.ArrayList;
import java.util.List;

public class P728 {


    private static boolean[] cache = new boolean[10001];

    static {
        initCache(1, 10000);
    }

    private static void initCache(int left, int right) {
        for (int v = left; v <= right; v++) {
            if (isNumber(v)) {
                cache[v] = true;
            }
        }
    }

    private static boolean isNumber(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        for (char c : arr) {
            if (c == '0') {
                return false;
            }
            int n = c - '0';

            if (num % n != 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (cache[i]) {
                result.add(i);
            }
        }
        return result;
    }
}
