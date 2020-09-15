package org.alking.p500;

import java.util.Map;
import java.util.TreeMap;

public class P532 {

    public int findPairs(int[] nums, int k) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int v : nums) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int v = entry.getKey();
            if (k == 0 && entry.getValue() > 1) {
                sum += 1;
            } else if (k >0 && map.containsKey(v + k)) {
                sum += 1;
            }
        }
        return sum;
    }
}
