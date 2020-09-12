package org.alking.p1300;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class P1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        TreeMap<Integer, List<Integer>> sortMap = new TreeMap<>();
        int v;
        List<Integer> list;
        for (int i = 0; i < nums.length; i++) {
            v = nums[i];
            list = sortMap.getOrDefault(v, new ArrayList<>());
            list.add(i);
            sortMap.put(v, list);
        }
        int[] result = new int[nums.length];
        int acc = 0;
        for (Map.Entry<Integer, List<Integer>> entry : sortMap.entrySet()) {
            list = entry.getValue();
            for (int idx : list) {
                result[idx] = acc;
            }
            acc += list.size();
        }
        return result;
    }
}
