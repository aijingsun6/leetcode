package org.alking.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HammingWeight {

    private Map<Integer, Integer> cache = new HashMap<>();

    private int findWeight(final int n) {

        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int sum = 0;
        int m = n;
        while (m > 0) {
            if ((m & 0x01) > 0) {
                sum += 1;
            }
            m = m >>> 1;
        }
        cache.put(n,sum);
        return sum;
    }

    public int hammingWeight(int n) {
        List<Integer> acc = new ArrayList<>();

        while (Math.abs(n) > 0){
            acc.add(n & 0xff);
            n = n >>> 8;
        }
        int sum = 0;
        for (int j : acc) {
            sum += findWeight(j);
        }
        return sum;
    }

}
