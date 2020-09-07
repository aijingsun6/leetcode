package org.alking.p300;

import java.util.*;

public class P347 {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> counterMap = new HashMap<>();
        TreeMap<Integer, Set<Integer>> sortMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int v : nums) {
            int c = counterMap.getOrDefault(v, 0);
            int c2 = c + 1;

            counterMap.put(v, c2);

            // remove old
            Set<Integer> s = sortMap.getOrDefault(c, new HashSet<>());
            s.remove(v);
            sortMap.put(c, s);

            // append new
            Set<Integer> s2 = sortMap.getOrDefault(c2, new HashSet<>());
            s2.add(v);
            sortMap.put(c2, s2);
        }


        int size = counterMap.size();
        size = Math.min(size, k);
        int[] result = new int[size];
        int idx = 0;
        for (Map.Entry<Integer, Set<Integer>> entry : sortMap.entrySet()) {
            if (idx < size) {
                for (Integer v : entry.getValue()) {
                    result[idx] = v;
                    idx += 1;
                }
            }else {
                break;
            }
        }
        return result;
    }
}
