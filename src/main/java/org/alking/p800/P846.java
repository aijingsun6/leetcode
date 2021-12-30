package org.alking.p800;

import java.util.Map;
import java.util.TreeMap;

public class P846 {


    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (groupSize < 1) {
            return false;
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int v : hand) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }
        while (!map.isEmpty()) {
            Map.Entry<Integer, Integer> f = map.firstEntry();
            for (int i = 0; i < groupSize; i++) {
                Integer k = f.getKey() + i;
                int c = map.getOrDefault(k, 0);
                if (c < f.getValue()) {
                    return false;
                } else if (c > f.getValue()) {
                    map.put(k, c - f.getValue());
                } else {
                    map.remove(k);
                }
            }
        }
        return true;
    }
}
