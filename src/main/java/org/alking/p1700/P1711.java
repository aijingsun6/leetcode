package org.alking.p1700;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class P1711 {

    public int countPairs(int[] deliciousness) {
        final int MOD = 1000000007;
        HashMap<Long, Long> cntMap = new HashMap<>();
        long max = 0;
        for (int v : deliciousness) {
            final long v2 = v;
            if (v2 > max) {
                max = v2;
            }
            cntMap.put(v2, cntMap.getOrDefault(v2, 0L) + 1);
        }
        long maxSum = max * 2;
        ArrayList<Long> pow = new ArrayList<>();
        long sum = 1;
        while (sum <= maxSum) {
            pow.add(sum);
            sum = sum * 2;
        }
        long acc = 0;
        for (Map.Entry<Long, Long> e : cntMap.entrySet()) {
            long v = e.getKey();
            long c = e.getValue();
            for (long s : pow) {
                long left = s - v;
                if (left == v) {
                    acc += c * (c - 1) / 2;
                    acc = acc % MOD;
                } else if (left > v && cntMap.containsKey(left)) {
                    acc += c * cntMap.get(left);
                    acc = acc % MOD;
                }
            }
        }
        return (int) acc;
    }


}
