package org.alking.p1600;

import java.util.*;

public class P1636 {

    public int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> cntMap = new HashMap<>();
        for (int n : nums) {
            cntMap.put(n, cntMap.getOrDefault(n, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(cntMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                int c1 = o1.getValue();
                int c2 = o2.getValue();
                if (c1 == c2) {
                    return o2.getKey() - o1.getKey();
                }
                return c1 - c2;
            }
        });

        int[] result = new int[nums.length];
        int idx = 0;
        for (Map.Entry<Integer, Integer> e : list) {
            Arrays.fill(result, idx, idx + e.getValue(), e.getKey());
            idx += e.getValue();
        }
        return result;
    }

}
