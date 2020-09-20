package org.alking.p0;

import java.util.*;

public class P15 {

    public List<List<Integer>> threeSum(int[] nums) {

        if (nums == null || nums.length < 3) {
            return Collections.emptyList();
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int v : nums) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }

        List<List<Integer>> acc = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int k = entry.getKey();
            if (k <= 0) {
                List<List<Integer>> add = threeSum(map, k);
                if (add != null && !add.isEmpty()) {
                    acc.addAll(add);
                }
            }
        }
        return acc;

    }

    private List<List<Integer>> threeSum(TreeMap<Integer, Integer> map, int min) {
        List<List<Integer>> acc = new ArrayList<>();
        int target = 0 - min;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int k = entry.getKey();
            int left = target - k;
            // min <= k <= left
            if (k < min) {
                continue;
            }

            if (left < min) {
                continue;
            }
            if (left < k) {
                continue;
            }

            if (map.containsKey(left)) {
                if (k == min && left == min) {

                    if( map.get(min) > 2){
                        acc.add(Arrays.asList(min, k, left));
                    }
                    continue;
                }

                if (k == min || k == left) {
                    if(entry.getValue() > 1){
                        acc.add(Arrays.asList(min, k, left));
                    }
                    continue;
                }


                acc.add(Arrays.asList(min, k, left));
            }
        }
        return acc;
    }
}
