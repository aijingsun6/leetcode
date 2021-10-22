package org.alking.p200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P229 {

    public List<Integer> majorityElement(int[] nums) {
        final int limit = nums.length / 3;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int v : nums) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }
        ArrayList<Integer> acc = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > limit) {
                acc.add(e.getKey());
            }
        }
        return acc;
    }
}
