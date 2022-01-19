package org.alking.p200;

import java.util.HashMap;

public class P219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            if (!map.containsKey(v)) {
                map.put(v, i);
                continue;
            }
            int prev = map.get(v);
            if (i - prev <= k) {
                return true;
            }
            map.put(v, i);

        }
        return false;
    }
}
